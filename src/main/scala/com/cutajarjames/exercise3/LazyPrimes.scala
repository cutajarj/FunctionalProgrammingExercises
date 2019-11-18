package com.cutajarjames.exercise3

/**
  * Create a scala stream that generates prime numbers
  *
  * A number X is prime iff all prime numbers up to sqrt(X) are not factors of X
  *
  * Examples:
  *   The number 9 is not a prime numbers because 3 is a factor, and 3 is less or equal than sqrt(9)
  *   The number 11 is a prime number because the prime numbers 2, 3 (less or equal than sqrt(11)) are not factors
  *   The number 97 is a prime number because the prime numbers 2, 3, 5 and 7 (less or equal than sqrt(97)) are not factors
  *
  *   HINT: Think recursive LazyList!
  */
class LazyPrimes {
  val allPrimes: LazyList[Int] = 2 #:: LazyList.from(3).filter { c =>
    val primesUptoSqrt = allPrimes.takeWhile(p => p <= math.sqrt(c))
    !primesUptoSqrt.exists(p => c % p == 0)
  }
}
