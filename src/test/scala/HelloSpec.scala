import org.scalatest._

class HelloSpec extends FunSuite with DiagrammedAssertions {
  test("Hello should work") {
    assert("hello".startsWith("h"))
  }
}
