//1,1,2,3,5,8,13,21
def fibonacci(n: Int): Int = if (n <= 1) {
  1
}
else {
  fibonacci(n - 2) + fibonacci(n - 1)
}

fibonacci(10)

val s = LazyList(1, 1, 2, 3, 5, 8, 13, 21)

val s1 = 1 #:: 1 #:: 2 #:: 3 #:: LazyList.empty

s1.take(4).toList

val fib: LazyList[Int] =
  1 #:: 1 #:: fib.zip(fib.tail).map(t => t._1 + t._2)

fib(10)
fibonacci(45)
fib(45)