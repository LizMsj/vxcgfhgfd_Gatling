import io.gatling.core.Predef.scenario
import Request._

object Simulation {
  def getRequestScenario = scenario("Test")
    .exec(getRequest)
}