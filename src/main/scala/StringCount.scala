object StringCount extends App {

  def transform(inputString: String) = {
    //   all letters must be same case, they have to be letters, no other restrictions
    // No instructions how to handle wrong input, I am just returning a message
    if (!(testAllUpperCase(inputString) || testAllLoverCase(inputString))) "Wrong input"
    else doTransform(inputString)
  }

  def reverseTransform(reversStr: String): String = {

    var buf = new StringBuilder
    // the first chart if is letter just added to the result
    if (reversStr.charAt(0).isLetter) buf += reversStr.charAt(0)
    // starting from the second char
    var position = 1
    while (position < reversStr.length) {
      if (reversStr.charAt(position).isLetter) {
        // we have to know digits of count
        var countNum = 0
        while ((position - 1 - countNum) >=0 && !reversStr.charAt(position - 1 - countNum).isLetter) {
          countNum += 1
          }
        val countStr = reversStr.substring(position  - countNum, position )
        val count = if (countStr == "") 1 else countStr.toInt
          for (a <- 0 until count ) {
            buf += reversStr.charAt(position)
        }
      }
      position += 1
    }
    buf.toString()
  }


  def doTransform(str: String): String = {
    var count = 1
    var firstChar: Char = '0'
    if (str.length <= 1) {
       str
    }
    else {
      firstChar = str.charAt(0)
      while ((count < str.length) && firstChar == str.charAt(count)) {
        count += 1
      }
      val resultCount = if (count == 1) "" else count.toString
      resultCount + firstChar + doTransform(str.substring(count))
    }
  }

  def testAllUpperCase(str: String): Boolean = {
    for (c <- str) {
      if (!c.isLetter) return false
      else if (!c.isUpper) return false
    }
    true
  }

  def testAllLoverCase(str: String): Boolean = {
    for (c <- str) {
      if (!c.isLetter) return false
      else if (c.isUpper) return false
    }
    true
  }
}
