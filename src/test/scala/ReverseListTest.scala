import org.scalatest.FunSuite
import java.awt.Color

class ReverseListTest extends FunSuite{
  test("ReverseList.reverse") {
    assert(ReverseList.reverse(List("Elena","Jani","Valentina")) === List("Valentina","Jani","Elena"))
    assert(ReverseList.reverse(List(Color.red,Color.green,Color.blue)) === List(Color.blue,Color.green,Color.red))
    assert(ReverseList.reverse(List(1,2,3,5)) === List(5,3,2,1))
  }
}
