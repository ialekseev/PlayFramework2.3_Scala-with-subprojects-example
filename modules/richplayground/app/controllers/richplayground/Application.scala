package controllers.richplayground

import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.richplayground.index("Your new application is ready."))
  }

}