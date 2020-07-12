package practice

import scala.annotation.StaticAnnotation
import scala.meta._
import scala.meta.inputs.Input.String

class mappable extends StaticAnnotation {
  inline def apply(defn: Any): Any = meta {
    val taggedAs = Term.Name("taggedAs")
    val tagSlowTest = Term.Apply(Term.Name("Tag"), List(Lit("SlowTest")))
    defn match {
      case c @ Defn.Class(_, _, _, _, Template(_, _, _, Some(t))) =>
        val s = t.toList.map(x => {
          x match {
            case w @ Term.Apply(Term.Select(Term.Apply(Term.Select(u1, u2), Seq(v)), a), b) if
            u2.value != "taggedAs" =>
              println(w.structure)
              val aa = Term.Apply(Term.Select(u1, u2), List(v))
              Term.Apply(Term.Select(Term.Apply(Term.Select(aa, taggedAs), List(tagSlowTest), a), b)
            case _ => x
          }
        })
        c.copy(templ = c.templ.copy(stats = Some(s)))
      case _ => defn
    }
  }
}


