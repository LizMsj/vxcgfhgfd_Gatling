import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Request {

  def getRequest = {
    exec(
      http("getReqres.in")
        .get("/index.html")
        .check(status.is(200))
    )
  }

}