object P02 {
  def secondLastBuiltin[A](ls: List[A]): A = {
	if (ls.isEmpty) throw new NoSuchElementException
	else ls.init.last
  }
  	
  def secondLastRecursive[A](ls: List[A]): A = ls match {
    case head :: _ :: Nil => {
      println(head)
      head
    }
    case _ :: tail 	   => { 
      println(tail)
      secondLastRecursive(tail)
    }
    case _ 			   => throw new NoSuchElementException
  }
  
  def lastNthBuiltin[A](n: Int, ls: List[A]): A = {
    if (n <= 0) throw new IllegalArgumentException
    if (ls.length < n) throw new NoSuchElementException
    ls.takeRight(n).head
  } 
}

