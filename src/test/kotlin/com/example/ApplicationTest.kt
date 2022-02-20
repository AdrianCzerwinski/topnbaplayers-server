package com.example

import com.example.models.ApiResponse
import com.example.repository.HeroRepository
import com.example.repository.NEXT_PAGE_KEY
import com.example.repository.PREVIOUS_PAGE_KEY
import io.ktor.http.*
import kotlin.test.*
import io.ktor.server.testing.*
import io.ktor.application.*
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.koin.java.KoinJavaComponent.inject

class ApplicationTest {
    private val heroRepository: HeroRepository by inject(HeroRepository::class.java)

    @Test
    fun `access root endpoint, assert correct information`() {
        withTestApplication(moduleFunction = Application::module) {
            handleRequest(HttpMethod.Get, "/").apply {
                assertEquals(
                    expected = HttpStatusCode.OK,
                    actual = response.status()
                )
                assertEquals(
                    expected = "Welcome to Boruto API",
                    actual = response.content
                )
            }
        }
    }

    @ExperimentalSerializationApi
    @Test
    fun `access all heroes endpoint, quary all pages, assert correct information`() {
        withTestApplication(moduleFunction = Application::module) {
            val pages = 1..5
            val heroes = listOf(
                heroRepository.page1,
                heroRepository.page2,
                heroRepository.page3,
                heroRepository.page4,
                heroRepository.page5
            )
            pages.forEach { page ->
                handleRequest(HttpMethod.Get, "/boruto/heroes?page=$page").apply {
                    assertEquals(
                        expected = HttpStatusCode.OK,
                        actual = response.status()
                    )
                    val actual = Json.decodeFromString<ApiResponse>(response.content.toString())
                    val expected = ApiResponse(
                        success = true,
                        message = "OK",
                        prevPage = calculatePage(page = page)[PREVIOUS_PAGE_KEY],
                        nextPage = calculatePage(page = page)[NEXT_PAGE_KEY],
                        heroes = heroes[page - 1],
                        lastUpdated = actual.lastUpdated
                    )


                    println("Expected: $expected")
                    println("Actual: $actual")
                    assertEquals(
                        expected = expected,
                        actual = actual
                    )

                }
            }
        }
    }

    @ExperimentalSerializationApi
    @Test
    fun `access all heroes endpoint, quary non-existing page number, assert an error`() {
        withTestApplication(moduleFunction = Application::module) {

            handleRequest(HttpMethod.Get, "/boruto/heroes?page=6").apply {
                assertEquals(
                    expected = HttpStatusCode.NotFound,
                    actual = response.status()
                )
                val expected = ApiResponse(
                    success = false,
                    message = "Heroes not found. Wrong Page Number"
                )

                val actual = Json.decodeFromString<ApiResponse>(response.content.toString())
                println("Expected: $expected")
                println("Actual: $actual")
                assertEquals(
                    expected = expected,
                    actual = actual
                )

            }

        }
    }

    @ExperimentalSerializationApi
    @Test
    fun `access all heroes endpoint, quary invalid page number, assert an error`() {
        withTestApplication(moduleFunction = Application::module) {

            handleRequest(HttpMethod.Get, "/boruto/heroes?page=invalid").apply {
                assertEquals(
                    expected = HttpStatusCode.BadRequest,
                    actual = response.status()
                )
                val expected = ApiResponse(
                    success = false,
                    message = "Only numbers allowed"
                )

                val actual = Json.decodeFromString<ApiResponse>(response.content.toString())
                println("Expected: $expected")
                println("Actual: $actual")
                assertEquals(
                    expected = expected,
                    actual = actual
                )

            }

        }
    }

    @ExperimentalSerializationApi
    @Test
    fun `access searched heroes endpoint, quary hero name, assert single hero result`() {
        withTestApplication(moduleFunction = Application::module) {

            handleRequest(HttpMethod.Get, "/boruto/heroes/search?name=sas").apply {
                assertEquals(
                    expected = HttpStatusCode.OK,
                    actual = response.status()
                )
                val actual = Json.decodeFromString<ApiResponse>(response.content.toString()).heroes.size

                assertEquals(
                    expected = 1,
                    actual = actual
                )

            }

        }
    }

    @ExperimentalSerializationApi
    @Test
    fun `access searched heroes endpoint, quary hero name, assert multiple hero result`() {
        withTestApplication(moduleFunction = Application::module) {

            handleRequest(HttpMethod.Get, "/boruto/heroes/search?name=sa").apply {
                assertEquals(
                    expected = HttpStatusCode.OK,
                    actual = response.status()
                )
                val actual = Json.decodeFromString<ApiResponse>(response.content.toString()).heroes.size

                assertEquals(
                    expected = 3,
                    actual = actual
                )

            }

        }
    }

    @ExperimentalSerializationApi
    @Test
    fun `access searched heroes endpoint, quary an empty hero name, assert empty list result`() {
        withTestApplication(moduleFunction = Application::module) {

            handleRequest(HttpMethod.Get, "/boruto/heroes/search?name=").apply {
                assertEquals(
                    expected = HttpStatusCode.OK,
                    actual = response.status()
                )
                val actual = Json.decodeFromString<ApiResponse>(response.content.toString()).heroes

                assertEquals(
                    expected = emptyList(),
                    actual = actual
                )

            }
        }
    }

    @ExperimentalSerializationApi
    @Test
    fun `access searched heroes endpoint, query non-existing hero, assert empty list as result`() {
        withTestApplication(moduleFunction = Application::module) {

            handleRequest(HttpMethod.Get, "/boruto/heroes/search?name=uknown").apply {
                assertEquals(
                    expected = HttpStatusCode.OK,
                    actual = response.status()
                )
                val actual = Json.decodeFromString<ApiResponse>(response.content.toString()).heroes

                assertEquals(
                    expected = emptyList(),
                    actual = actual
                )
            }
        }
    }

    @ExperimentalSerializationApi
    @Test
    fun `access non-existing endpoint, assert not found`() {
        withTestApplication(moduleFunction = Application::module) {

            handleRequest(HttpMethod.Get, "/uknown").apply {
                assertEquals(
                    expected = HttpStatusCode.NotFound,
                    actual = response.status()
                )
                assertEquals(
                    expected = "Page not Found",
                    actual = response.content
                )
            }
        }
    }

    private fun calculatePage(page: Int): Map<String, Int?> {
        var prevPage: Int? = page
        var nextPage: Int? = page
        if (page in 1..4) {
            nextPage = nextPage?.plus(1)
        }
        if (prevPage in 2..5) {
            prevPage = prevPage?.minus(1)
        }
        if (page == 1) {
            prevPage = null
        }
        if (page == 5) {
            nextPage = null
        }
        return mapOf(PREVIOUS_PAGE_KEY to prevPage, NEXT_PAGE_KEY to nextPage)
    }
}