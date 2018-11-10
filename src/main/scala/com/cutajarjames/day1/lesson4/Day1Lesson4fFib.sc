//1,1,2,3,5,8,13,21
def fibonacci(n: Int): Int = if (n <= 1) {
  1
}
else {
  fibonacci(n - 2) + fibonacci(n - 1)
}

fibonacci(10)

val s = Stream(1, 1, 2, 3, 5, 8, 13, 21)

val s1 = 1 #:: 1 #:: 2 #:: 3 #:: Stream.empty

s1.take(4).toList

val fib: Stream[Int] =
  1 #:: 1 #:: fib.zip(fib.tail).map(t => t._1 + t._2)

fib(10)
fibonacci(45)
fib(45)