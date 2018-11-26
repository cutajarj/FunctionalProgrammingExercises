val list = List("James", "Ruth", "Isabel", "Tom", "Lucy")

val names = list.filter { n =>
  println(s"Checking $n")
  n.length < 5
}
  .map { n =>
    println(s"toUpper $n")
    n.toUpperCase
  }.take(2)


val stream = Stream("James", "Ruth", "Isabel", "Tom", "Lucy")

stream.filter { n =>
  println(s"Checking $n")
  n.length < 5
}
  .map { n =>
    println(s"toUpper $n")
    n.toUpperCase
  }.take(2).toList

