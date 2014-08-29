object P01 {
  def lastBuiltin[A](ls: List[A]): A = ls.last
  
   println(lastBuiltin(List(1,2,3,4)))
  
  def lastRecursive[A](ls: List[A]): A = ls match {
    case h :: Nil => h
    case _ :: tail => lastRecursive(tail)
    case _         => throw new NoSuchElementException
  }
  
  println(lastRecursive(List(1,2,3,4,5)))
  
  further test ssh

}