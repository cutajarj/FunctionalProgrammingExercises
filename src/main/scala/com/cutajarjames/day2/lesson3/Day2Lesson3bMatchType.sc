val numbers = List[Any](1, 2, 5.4, 2, 6.2, 2)

numbers.map(n => n match {
  case i: Int => s"$i is an Int"
  case d: Double => s"$d is a Double"
  case _ => "NA"
})

val numbers2 = List[Any](1, 2, 5.4, 2, 6.2, 2, "TWO")

numbers2.map{
  case i: Int => s"$i is an Int"
  case d: Double => s"$d is a Double"
  case _ => "NA"
}

