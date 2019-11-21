//val x = 99
val x = 97
val primesUpTo10 = List(2, 3, 5, 7)
x % 2 == 0
x % 3 == 0
x % 5 == 0
x % 7 == 0

val s0: LazyList[Int] = 2 #:: LazyList.empty[Int]

s0.toList

val s1: LazyList[Int] = 2 #:: LazyList.from(3)

s1.take(10).toList

val s2: LazyList[Int] = 2 #::
  LazyList.from(3).filter(c => c % 2 > 0)

s2.take(10).toList

val s3: LazyList[Int] = 2 #::
  LazyList.from(3).filter(c => c % 2 > 0 && c % 3 > 0)

s3.take(10).toList

s3.takeWhile(n => n < 40).toList

val myList = (1 to 10).toList

myList.contains(11)

!myList.exists(n => n % 2 == 0)

val allPrimes: LazyList[Int] = 2 #:: LazyList.from(3)
  .filter { c =>
    val primesUpToSqrtC = allPrimes.takeWhile(p => p <= math.sqrt(c))
    !primesUpToSqrtC.exists(p => c % p == 0)
  }

allPrimes.takeWhile(n => n < 200).toList
