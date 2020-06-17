object ReverseList extends App {

  def reverse[A](src: List[A], dest: List[A] = Nil): List[A] = {
    if (src == Nil) dest else reverse(src.tail, src.head :: dest)
  }
}
