package assets.javascripts

import play.api.libs.json._
import play.api.libs.json.Json.toJson
import controllers.WebJarAssets

/**
 * This object contains the configuration that is retrieved by JavaScript.
 *   
 * The configuration consists of two parts:
 * - available libraries
 * - other configuration
 * 
 */
object JsConfiguration {

  private def webjar(file: String) = controllers.routes.WebJarAssets.at(WebJarAssets locate file).url
  private def asset(file: String) = controllers.routes.Assets.at(file).url

  private lazy val jsConfiguration = JsObject(Seq.empty)

  private lazy val availableLibraries = Map(
    "jquery" -> webjar("jquery.min.js"),
    "bootstrap" -> webjar("bootstrap.min.js")
  )

  def create() = {
    toJson(Map(
      "availableLibraries" -> toJson(availableLibraries),
      "jsConfig" -> toJson(jsConfiguration)
    ))
  }
}