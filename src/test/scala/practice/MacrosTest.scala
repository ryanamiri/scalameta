package practice

import org.scalatest.flatspec.AnyFlatSpecLike
import org.scalatest.matchers.should.Matchers

class MacrosTest extends AnyFlatSpecLike with Matchers {

  "testFunction" should "return it's input" in {
    TestClass(1).toMap() shouldEqual Map.empty[String, Any]
  }
}

@mappable
case class TestClass(a: Int)
