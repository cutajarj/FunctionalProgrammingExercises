package com.cutajarjames.exercise3

class StreamingPrimes {
  val allPrimes: Stream[Int] = 2 #:: Stream.from(3)
}
