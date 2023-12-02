import io.gatling.core.Predef._
import io.gatling.http.Predef._

import Simulation._

class SimpleTest extends Simulation {
  val httpConf = http.baseUrl("https://www.demoblaze.com/")
  setUp(
    getRequestScenario.inject(
      constantUsersPerSec(1) during(1))
      .protocols(httpConf)
    )
}