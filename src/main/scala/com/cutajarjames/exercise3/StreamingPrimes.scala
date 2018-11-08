package com.cutajarjames.exercise3

class StreamingPrimes {
  val allPrimes: Stream[Int] = 2 #:: Stream.from(3).filter { c =>
    val primesUptoSqrt = allPrimes.takeWhile(p => p <= math.sqrt(c))
    !primesUptoSqrt.exists(p => c % p == 0)
  }
}
