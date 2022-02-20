package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Hero

const val NEXT_PAGE_KEY = "nextPage"
const val PREVIOUS_PAGE_KEY = "prevPage"

class HeroRepositoryImpl : HeroRepository {

    override val heroes: Map<Int, List<Hero>> by lazy {
        mapOf(
            1 to page1,
            2 to page2,
            3 to page3,
            4 to page4,
            5 to page5
        )
    }

    override val page1 = listOf(
        Hero(
            id = 1,
            name = "Michael Jordan",
            image = "/images/mj.jpg",
            about = "Jordan was the face of the NBA for a long time, and his star status outside of the basketball world was almost hard to believe, and still sort of is. Overall, he’s still currently the GOAT. His mid-range game – face-ups, jab-steps, pull-ups, turnarounds, fadeaway, all of it – was second to none, and he was also a freakish athlete who could finish through contact and over length. And then there was the aspect of his clutchness, as Jordan was so often successful in nailing game-winners in the most high-pressure situations imaginable. Oh, and he was a top-tier defender, too.",
            rating = 5.0,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf(
                "Chicago Bulls",
            ),
            abilities = listOf(
                "Mid-Range",
                "Defense",
                "Scoring",
                "Clutch",
                "Intelligence"
            ),
            natureTypes = listOf(
                "6x NBA Champion",
                "6x Finals MVP",
                "5x MVP",
                "1 x DPoY",
                "9x All NBA"
            )
        ),
        Hero(
            id = 2,
            name = "LeBron James",
            image = "/images/lbj.jpg",
            about = "LeBron came into the NBA with unreal expectations and somehow managed to surpass all of them – and then some. James is clutch, he can score at a ridiculous level despite that not being his best attribute, rebounds well and is a fantastic playmaker, his most impressive trait. Few players have ever matched James’ absurd basketball IQ, one that he’ll use to continue to dominate for the next few seasons as his late prime winds down. If we re-do this exercise in a half-decade, James could very well finish first.",
            rating = 5.0,
            power = 98,
            month = "Oct",
            day = "10th",
            family = listOf(
                "LA Lakers",
                "Cleveland Cavaliers",
                "Miami Heats",
            ),
            abilities = listOf(
                "Intelligence",
                "Power",
                "Passing",
                "Scoring"
            ),
            natureTypes = listOf(
                "4x NBA Champion",
                "4x Finals MVP",
                "4x MVP",
                "13x Fist All NBA",
                "5x Defence All NBA"
            )
        ),
        Hero(
            id = 3,
            name = "Kobe Bryant",
            image = "/images/kb.jpg",
            about = "Not as high a peak as other megastars, but his career is one of amazingly sustained excellence – a result of an almost unparalleled work ethic and devotion to his craft, which helped him develop into an outrageous scorer out of the mid-range and near the rim, and a high-impact perimeter defender. Kobe Bryant was first a sidekick to Shaq before then becoming the man for the Lakers and winning five titles overall, two of which he earned Finals MVPs for. Bryant, who finished his career with more All-NBA 1st Team selections than Jordan (!), also probably turned more people into basketball fans than any player not named Michael (or Earvin).",
            rating = 5.0,
            power = 97,
            month = "Mar",
            day = "28th",
            family = listOf(
                "LA Lakers",
                "*RIP*"
            ),
            abilities = listOf(
                "Mid-Range",
                "Defense",
                "Scoring",
                "Clutch",
                "BLACK MAMBA"
            ),
            natureTypes = listOf(
                "5x NBA Champion",
                "2x Finals MVP",
                "1x MVP",
                "11x Fist All NBA",
                "9x Defence All NBA"
            )
        )
    )
    override val page2 = listOf(
        Hero(
            id = 4,
            name = "Kareem Abdul-Jabbar",
            image = "/images/kaj.jpg",
            about = "The GOAT debate is considered a two-horse race at this point in the NBA, but if there is a strong third candidate, it’s Kareem Abdul-Jabbar, who dominated for almost two decades thanks to his skyhook shot and overall greatness as a scorer, rebounder and shot-blocker. If anything, the longevity argument is still with Abdul-Jabbar, as the all-time big man won his two Finals MVP awards 14 years apart, first in 1971 and then again in 1985. Most players’ careers don’t last anywhere near that long, yet Abdul-Jabbar was dominating at the highest level for that long. Still, Jordan and James are too tough to overcome, despite Abdul-Jabbar’s resume.",
            rating = 4.9,
            power = 93,
            month = "Mar",
            day = "27th",
            family = listOf(
                "LA Lakers",
                "Milwaukee Bucks"
            ),
            abilities = listOf(
                "Inside Scoring",
                "Defense",
                "Sky Hook",
                "Rebounding",
            ),
            natureTypes = listOf(
                "6x NBA Champion",
                "2x Finals MVP",
                "6x MVP",
                "10x Fist All NBA",
                "5x Defence All NBA"
            )
        ),
        Hero(
            id = 5,
            name = "Magic Johnson",
            image = "/images/magic.jpg",
            about = "The consensus best point guard in NBA history comes at No. 4 on our list. The leader of one of the finest teams in basketball history, Magic Johnson had flash, pizzazz and any adjective you can think of as a playmaker, often hightailing it down the open floor and making spectacular passes that not many others would have attempted, let alone pulled off as successfully as he did. Magic was also a winner, making iconic plays over and over again in the biggest of stages. Add in his super charismatic personality and you have the complete package as one of the biggest superstars the league has ever seen.",
            rating = 4.8,
            power = 92,
            month = "Mar",
            day = "31st",
            family = listOf(
                "LA Lakers"
            ),
            abilities = listOf(
                "Passing",
                "BB IQ",
                "All-arounder",
                "Driving",
            ),
            natureTypes = listOf(
                "5x NBA Champion",
                "3x Finals MVP",
                "3x MVP",
                "9x Fist All NBA"
            )
        ),
        Hero(
            id = 6,
            name = "Bill Russell",
            image = "/images/br.jpg",
            about ="Bill Russell’s record for most NBA titles will never be beaten, as no one has come, or will come close to his 11 career championships. Russell’s resume is actually hurt because many accolades, like Finals MVP or Defensive Player of the Years didn’t even exist in his heyday. What’s more, since blocks weren’t recorded as a stat in his career, there’s no way to know how many Russell had for his career. There’s a chance he would be at the top of blocks standings along with the player coming up next on our ranking. Russell may not have had the longest career, but boy, was that run successful. Just as a curious note: Russell had more MVPs than All-NBA 1st Team selections in his career (three).",
            rating = 4.9,
            power = 95,
            month = "Jul",
            day = "25th",
            family = listOf(
                "Boston Celtics"
            ),
            abilities = listOf(
                "Defence",
                "BB IQ",
                "All-arounder",
                "Blocking",
            ),
            natureTypes = listOf(
                "11x NBA Champion",
                "5x MVP",
                "11x Fist All NBA",
                "12x All-Star"
            )
        )
    )
    override val page3 = listOf(
        Hero(
            id = 7,
            name = "Wilt Chamberlain",
            image = "/images/wc.jpg",
            about = "The most dominant big man offensively in NBA history, though that partially had to do with the level of competition Wilt Chamberlain faced in his era. Still, when you dominate at the level Chamberlain did, who cares who he did it against? Chamberlain did come a little short in the team success department as he was usually better in the regular season than in the playoffs, something that many believe had to do with an unwillingness to get fouled late in close games due to his unreliable free throw.\n" +
                    "\n" +
                    "Chamberlain’s single-season rebounding and scoring records are unassailable. Plus he has the second-best scoring average behind only Jordan. And had MJ played one more year with the Wizards, Chamberlain might actually be No. 1 in that stat. Chamberlain is also the only guy to lead the league in total scoring, rebounds and assists for a season, and retired as the all-time leader in scoring and rebounding at the time.",
            rating = 4.2,
            power = 92,
            month = "Jan",
            day = "1st",
            family = listOf(
                "Philadelphia Warriors",
                "San Francisco Warriors",
                "Philadelphia 76ers",
                "LA Lakers"
            ),
            abilities = listOf(
                "Scorer",
                "Power",
                "Big",
                "Blocking",
            ),
            natureTypes = listOf(
                "2x NBA Champion",
                "1x Finals MVP",
                "4x MVP",
                "7x Fist All NBA",
                "13x All-Star"
            )
        ),
        Hero(
            id = 8,
            name = "Larry Bird",
            image = "/images/lb.jpg",
            about = "There was a tie between Larry Bird and the next player on our ranking, one that we had to break up by looking at individual votes and seeing which player each voter had higher on their list. Bird may not rank super high in the stat department – a byproduct of a shorter career than normal for NBA superstars and being part of a star-studded team – but there’s no questioning his status as an all-time great, as the legendary swingman filled the stat sheet and possessed a terrific all-around game, as a shooter, overall scorer, rebounder and playmaker.",
            rating = 4.5,
            power = 97,
            month = "Oct",
            day = "27th",
            family = listOf(
                "Boston Celtics"
            ),
            abilities = listOf(
                "All-arounder",
                "3PT",
                "Defence",
                "BB IQ",
            ),
            natureTypes = listOf(
                "3x NBA Champion",
                "2x Finals MVP",
                "3x MVP",
                "9x Fist All NBA",
                "12x All-Star"
            )
        ),
        Hero(
            id = 9,
            name = "Shaquille O'Neal",
            image = "/images/shaq.jpg",
            about = "The most dominant physical specimen in the NBA since the days of Chamberlain, Shaquille O’Neal was an absolute freak with his blend of size, strength and unreal explosiveness. During O’Neal’s peak years, teams were making moves with the sole intention of containing the big man. Many ho-hum centers made a killing thanks to that just because they were another huge body to throw at O’Neal.\n" +
                    "\n" +
                    "The fact the Big Artistotle won only one MVP was kind of ridiculous in hindsight, as there were various seasons he was the most dominant player in the league. O’Neal wanting to be a star off the court probably took away a bit of impact on the court a bit, but he was devastating throughout his career regardless, even despite being a porous free-throw shooter.",
            rating = 4.5,
            power = 100,
            month = "Sep",
            day = "15th",
            family = listOf(
                "LA Lakers",
                "Miami Heat",
                "Pheonix Suns",
                "Cleveland Cavaliers"
            ),
            abilities = listOf(
                "POWER",
                "Inside Scoring",
                "Dominant",
                "BB IQ",
            ),
            natureTypes = listOf(
                "4x NBA Champion",
                "3x Finals MVP",
                "1x MVP",
                "8x Fist All NBA",
                "15x All-Star"
            )
        )
    )
    override val page4 = listOf(
        Hero(
            id = 10,
            name = "Tim Duncan",
            image = "/images/timd.jpg",
            about = "The rare low-maintenance superstar, Tim Duncan was impactful and successful team-wise from the get-go through the end of his career. Duncan anchored the winningest team of the century and did so in a low-key manner, without enough acclaim for his greatness or accomplishments. Don’t believe us? How about the fact that he never won Defensive Player of the Year despite making eight 1st Team All-Defenses, making that slight a major travesty, one that shows how underrated he was even in his prime. There’s even a chance Duncan would be ranked higher in many GOAT lists with a more entertaining off-court persona, but either way, he’s the greatest power forward ever.",
            rating = 4.8,
            power = 95,
            month = "Jan",
            day = "1st",
            family = listOf(
                "San Antonio Spurs"
            ),
            abilities = listOf(
                "Inside Scoring",
                "Fundamentals",
                "BB IQ",
                "Defence"
            ),
            natureTypes = listOf(
                "5x NBA Champion",
                "3x Finals MVP",
                "2x MVP",
                "10x Fist All NBA",
                "15x All-Star"
            )
        ),
        Hero(
            id = 11,
            name = "Hakeem Olajuwon",
            image = "/images/hakeem.jpg",
            about = "The first international player on the list, Hakeem Olajuwon was one of the greatest big men ever, and he competed and produced at an elite level on both ends of the floor with outstanding low-post moves and defensive skills to match. Olajuwon ranks first in blocks on record, though there’s a bit of an asterisk on that because they didn’t keep track of those before 1973-74. Also, he is the only player to rank Top 14 in four different major statistical categories: points, rebounds, blocks and steals.",
            rating = 4.2,
            power = 89,
            month = "Jan",
            day = "1st",
            family = listOf(
                "Houston Rockets"
            ),
            abilities = listOf(
                "Inside Scoring",
                "Fundamentals",
                "Dream Shake",
                "Defence"
            ),
            natureTypes = listOf(
                "2x NBA Champion",
                "2x Finals MVP",
                "1x MVP",
                "6x Fist All NBA",
                "12x All-Star"
            )
        ),
        Hero(
            id = 12,
            name = "Kevin Durant",
            image = "/images/kd.jpg",
            about = "Scoring comes so easy for him it’s almost ridiculous, as Kevin Durant is a 7-footer with ball-handling, quickness and a pristine jumper that he can hit from legitimately anywhere on the floor. Durant’s also an impactful defender when he needs to be, moving his feet quickly and blocking shots at pivotal moments. Durant should move up a few spots in the rankings yet, but will not be in contention for the top spots due to missed time because of injury.",
            rating = 3.4,
            power = 95,
            month = "Jan",
            day = "1st",
            family = listOf(
                "Oklahoma Thunder",
                "Brooklyn Nets",
                "GS Warriors"
            ),
            abilities = listOf(
                "Scoring",
                "3PT",
                "Defence"
            ),
            natureTypes = listOf(
                "2x NBA Champion",
                "2x Finals MVP",
                "1x MVP",
                "6x Fist All NBA",
                "11x All-Star"
            )
        )
    )
    override val page5 = listOf(
        Hero(
            id = 13,
            name = "Dirk Nowitzki",
            image = "/images/dn.jpg",
            about = "The first European player on the list, Dirk Nowitzki was another revolutionary player thanks to his three-point and off-the-dribble prowess in a 7-foot-tall body. Nowitzki’s elite skill level made the common thinking go from being that big men need to stay in the paint to: If your big men don’t space the floor, you’re at a disadvantage. Nowitzki made a contender, and eventually a champion, out of the Mavericks without star sidekicks for the most part of his career, hoisting the trophy in 2011 and winning Finals MVP for his efforts.",
            rating = 4.0,
            power = 88,
            month = "Jan",
            day = "1st",
            family = listOf(
                "Dallas Mavericks"
            ),
            abilities = listOf(
                "Scoring",
                "3PT"
            ),
            natureTypes = listOf(
                "1x NBA Champion",
                "1x Finals MVP",
                "1x MVP",
                "12x Fist All NBA",
                "14x All-Star"
            )
        ),
        Hero(
            id = 14,
            name = "Giannis Antetokounmpo",
            image = "/images/giannis.jpg",
            about = "A rags to riches story if there ever was one, Giannis Antetokounmpo went from playing in a semi-professional league to being a 15th-overall pick in the draft to winning multiple league MVP awards and a ring before turning 27. Antetokounmpo is a player who will likely finish far higher on this list if we re-do the exercise in a decade. The Greek forward boasts freakish length and athleticism plus massive work ethic and motor, which help him absolutely dominate despite lacking an outside jumper.",
            rating = 5.0,
            power = 100,
            month = "Jan",
            day = "1st",
            family = listOf(
                "Milwaukee Bucks"
            ),
            abilities = listOf(
                "Scoring",
                "Defence",
                "Driving",
                "Power"
            ),
            natureTypes = listOf(
                "1x NBA Champion",
                "1x Finals MVP",
                "2x MVP",
                "3x Fist All NBA",
                "5x All-Star"
            )
        ),
        Hero(
            id = 15,
            name = "Stephen Curry",
            image = "/images/sc.jpg",
            about = "Stephen Curry changed the way the game is played, as now, basically every player on the floor wants to shoot threes, and needs to be able to hit them for your offense to keep up with modern scoring. Curry’s a wizard not only as a shooter, but his playmaking deserves more credit than it receives. The future Hall-of-Famer out of Davidson is already the greatest shooter ever – and it’s not particularly close.",
            rating = 4.5,
            power = 90,
            month = "Jan",
            day = "1st",
            family = listOf(
                "GS Warriors"
            ),
            abilities = listOf(
                "Scoring",
                "3PT",
                "Driving",
                "Shooter"
            ),
            natureTypes = listOf(
                "3x NBA Champion",
                "2x MVP",
                "4x Fist All NBA",
                "8x All-Star"
            )
        )
    )


    override suspend fun getAllHeroes(page: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "OK",
            prevPage = calculatePage(page = page)[PREVIOUS_PAGE_KEY],
            nextPage = calculatePage(page = page)[NEXT_PAGE_KEY],
            heroes = heroes[page]!!,
            lastUpdated = System.currentTimeMillis()
        )
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

    override suspend fun searchHeroes(name: String?): ApiResponse {
        return ApiResponse(
            success = true,
            message = "OK",
            heroes = findHeroes(query = name)
        )
    }

    private fun findHeroes(query: String?): List<Hero> {
        val founded = mutableListOf<Hero>()
        return if (!query.isNullOrEmpty()) {
            heroes.forEach { (_, heroes) ->
                heroes.forEach { hero ->
                    if (hero.name.lowercase().contains(query.lowercase())) {
                        founded.add(hero)
                    }
                }
            }

            founded
        } else {
            emptyList()
        }
    }
}