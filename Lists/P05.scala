object P05 {
  def reverseRecursive[A](ls:List[A]): List[A] = ls match {
    case Nil    => Nil
    case h :: tail => reverseRecursive(tail) ::: List(h)
  }
  
  def reverseFunctional[A](ls: List[A]): List[A] =
    ls.foldLeft(List[A]()){ (r, h) => h :: r }
}
