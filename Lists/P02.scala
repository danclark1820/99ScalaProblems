object P02 {
  def secondLastBuiltin[A](ls: List[A]): A = {
	if (ls.isEmpty) throw new NoSuchElementException
	else ls.init.last
  }
  
  
	
  def secondLastRecursive[A](ls: List[A]): A = ls match {
    case head :: _ :: Nil =>  head
    case _ :: tail 	      => secondLastRecursive(tail)
    case _ 			      => throw new NoSuchElementException
  }

  
  def lastNthBuiltin[A](n: Int, ls: List[A]): A = {
    if (n <= 0) throw new IllegalArgumentException
    if (ls.length < n) throw new NoSuchElementException
    ls.takeRight(n).head
  }
  
  
//  def lastNthRecursive[A](n: Int, ls: List[A]): A = {
//    def lastNthR(count: Int, resultList: List[A], curList: List[A]): A = {
//      curList match {
//        case Nil if count > 0 => throw new NoSuchElementException
//        case Nil 			  => resultList.head
//        case _ :: tail		  =>
//          lastNthR(count - 1,
//        		   if (count > 0) resultList else resultList.tail, tail)
//      }
//    if (n <= 0) throw new IllegalArgumentException
//    else lastNthR(n, ls, ls)
//    }
//  } 
}

