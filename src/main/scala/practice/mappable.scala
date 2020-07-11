package practice

import scala.annotation.StaticAnnotation
import scala.meta._

class mappable extends StaticAnnotation {
  inline def apply(defn: Any): Any = meta {
    val q"..$mods class $tName (..$params) extends $template" = defn

    val res =
      q"""
      ..$mods class $tName(..$params) {
        def toMap(): Map[String, Any] = Map[String, Any]()
      }
    """

    println("============== result ==============")
    println(res)
    println("====================================")
    res
  }
}


