package com.cutajarjames.day1.lesson2

/**
  * From Wikipedia: https://en.wikipedia.org/wiki/Leap_year
  *
  * if (year is not divisible by 4) then (it is a common year)
  * else if (year is not divisible by 100) then (it is a leap year)
  * else if (year is not divisible by 400) then (it is a common year)
  * else (it is a leap year)
  */
object LeapYears {
  def leapYearCheck(year: Int): String =
    ""

  def main(args: Array[String]) {
    println(s"1904 is ${leapYearCheck(1904)} - SHOULD BE LEAP YEAR")
    println(s"1906 is ${leapYearCheck(1906)} - SHOULD BE COMMON YEAR")
    println(s"1908 is ${leapYearCheck(1980)} - SHOULD BE LEAP YEAR")
    println(s"1999 is ${leapYearCheck(1999)} - SHOULD BE COMMON YEAR")
    println(s"2000 is ${leapYearCheck(2000)} - SHOULD BE LEAP YEAR")
  }
}
