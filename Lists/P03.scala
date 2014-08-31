object P03 {
  def kthBuiltin[A](ls: List[A], k:Int):A ={
    if (k >= 0) ls(k)
    else throw new NoSuchElementException
  }
  
  def kthRecursive[A](ls: List[A], k:Int):A = (k, ls) match {
    case (0, h :: _  ) => h
    case(k, _ :: tail) => kthRecursive(tail, k - 1)
    case(_, Nil      ) => throw new NoSuchElementException
  }
}