import org.scalatest.FunSuite

class StringCountTest extends FunSuite {
  test("StringCount.transform") {
    assert(StringCount.transform("HEllo") === "Wrong input")
    assert(StringCount.transform("1") === "Wrong input")
    assert(StringCount.transform("A") === "A")
    assert(StringCount.transform("AAAAABBBCCC") === "5A3B3C")
    assert(StringCount.transform("AAAAABCDDD") === "5ABC3D")
    assert(StringCount.transform("ABCDDD") === "ABC3D")
    assert(StringCount.transform("abbcddddd") === "a2bc5d")
    assert(StringCount.transform("AAAAAAAAAAABCCCCCCCCCCCCCDDD") === "11AB13C3D")


    assert(StringCount.reverseTransform("5A3B3C") === "AAAAABBBCCC")
    assert(StringCount.reverseTransform("5ABC3D") === "AAAAABCDDD")
    assert(StringCount.reverseTransform("ABC3D") === "ABCDDD")
    assert(StringCount.reverseTransform("a2bc5d") === "abbcddddd")
    assert(StringCount.reverseTransform("11AB13C3D") === "AAAAAAAAAAABCCCCCCCCCCCCCDDD")
    assert(StringCount.reverseTransform("A12B") === "ABBBBBBBBBBBB")
    assert(StringCount.reverseTransform("2A12B") === "AABBBBBBBBBBBB")

  }
}
