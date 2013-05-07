package controllers

import play.api._
import play.api.mvc._
import play.api.libs.Jsonp
import play.api.libs.json.Json
import assets.javascripts.JsConfiguration

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

 def jsConfig(callback: String) = Action { request =>
    // serve the configuration as JSONP
    Ok(Jsonp(callback, JsConfiguration.create))
 }
  
}