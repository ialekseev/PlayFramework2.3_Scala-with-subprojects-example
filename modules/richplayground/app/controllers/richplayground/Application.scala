package controllers.richplayground

import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok("sdsd")
    //Ok(views.html.index("Your new application is ready."))
  }

}