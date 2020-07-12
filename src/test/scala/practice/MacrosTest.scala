package practice

import org.scalatest.Tag
import org.scalatest.flatspec.AnyFlatSpecLike
import org.scalatest.matchers.should.Matchers

@mappable
class MacrosTest extends AnyFlatSpecLike with Matchers {

  "testFunction" should "return it's input" taggedAs Tag("SlowTest") in {
  }

  it should "something" in {
  }

  "something" should "something else" taggedAs Tag("SlowTest") in {
  }
}

//@mappable
//case class TestClass(a: Int)
