object myFilter {
    def f(delim:Int,arr:List[Int]):List[Int] = {
      def facc(del:Int, curList:List[Int], result:List[Int]): List[Int] = curList match {
        case Nil        => result
        case h :: tail  => {
          if (h < del) facc(del, curList.tail, result ::: List(h))
          else facc(del, curList.tail, result)  
        }
      }
      facc(delim, arr, List())
    }
}