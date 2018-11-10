val list = List("James", "Ruth", "Isabel", "Tom", "Lucy")

val names = list.filter { n =>
  println(s"Checking $n")
  n.length < 5
}.map { n =>
  println(s"toUpper $n")
  n.toUpperCase
}

names(1)

val stream = Stream("James", "Ruth", "Isabel", "Tom", "Lucy")

val sNames = stream.filter { n =>
  println(s"Checking $n")
  n.length < 5
}.map { n =>
  println(s"toUpper $n")
  n.toUpperCase
}

sNames(1)

sNames(1)
