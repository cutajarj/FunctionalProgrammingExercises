
val str = "James"

str match {
  case "David" => "Hello David"
  case "James" => "Yo James"
  case _ => "I don't know you"
}


val numbers = List(1,2,3,4,5)

//"one", "TWO", "THREE" ...

numbers.map(n => n match {
  case 1 => "ONE"
  case 2 => "TWO"
  case 3 => "THREE"
  case _ => "???"
})

numbers.map{
  case 1 => "ONE"
  case 2 => "TWO"
  case 3 => "THREE"
  case _ => "???"
}

/*numbers.map{
  case 1 => "ONE"
  case 2 => "TWO"
  case 3 => "THREE"
}*/

numbers.collect{
  case 1 => "ONE"
  case 2 => "TWO"
  case 3 => "THREE"
}
