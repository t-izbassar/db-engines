import org.scalatest.diagrams.Diagrams
import org.scalatest.funsuite.AnyFunSuite

class HelloSpec extends AnyFunSuite with Diagrams {
  test("Hello should work") {
    assert("hello".startsWith("h"))
  }
}
