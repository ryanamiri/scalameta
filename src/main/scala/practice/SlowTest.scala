package practice

import scala.meta._
import scala.annotation.{StaticAnnotation, compileTimeOnly}



@compileTimeOnly("Not sure where this prints")
class SlowTest extends StaticAnnotation{

}
