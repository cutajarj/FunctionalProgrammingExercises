abstract class Fruit(name:String)

case class Apple(name: String, weightInG: Int) extends Fruit(name)

case class Banana(name: String, weightInG: Int, length: Int) extends Fruit(name)

val fruits = List(Apple("Gala", 20), Banana("Madeira", 50, 15))

fruits.map{
  case Apple(n, w) => s"The $n apples weighs $w"
  case Banana(n, w, l) => s"The $n banana weighs $w and is $l in length"
  case _ => "Don't know what this is"
}


fruits.map{
  case Apple(n, w) => s"The $n apples weighs $w"
  case Banana(n, _, l) => s"The $n banana is $l in length"
  case _ => "Don't know what this is"
}

fruits.map{
  case Apple("Gala", w) => s"The gala apples weighs $w"
  case Banana(n, _, l) => s"The $n banana is $l in length"
  case _ => "Don't know what this is"
}
