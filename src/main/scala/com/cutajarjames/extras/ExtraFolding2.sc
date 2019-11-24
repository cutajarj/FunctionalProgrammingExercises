val numbers = Array(5, 4, 3, 7, 2, 8)

numbers.foldLeft(0)((sum, n) => sum + n)

numbers.reduceLeft((sum, n) => sum + n)

val emptyList = List[Int]()

//emptyList.reduceLeft((sum, n) => sum + n)

numbers.reduceLeftOption((sum, n) => sum + n)

emptyList.reduceLeftOption((sum, n) => sum + n)