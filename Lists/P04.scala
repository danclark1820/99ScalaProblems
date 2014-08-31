object P04 {
  def lastBuiltin[A](ls: List[A]): Int = ls.length
  
  def lengthRecursive[A](ls: List[A]): Int = ls match {
    case Nil => 0
    case _ :: tail => 1 + lengthRecursive(tail)
  }
  
  def lengthTailRecursive[A](ls: List[A]): Int = {
    def lengthR(result: Int, curList: List[A]): Int = curList match {
      case Nil       => result
      case _ :: tail => lengthR(result + 1, tail)
    }
    lengthR(0, ls)
  }
  
  def lengthFunctional[A](ls: List[A]): Int = ls.foldLeft(0){ (c,_) => c + 1}
}