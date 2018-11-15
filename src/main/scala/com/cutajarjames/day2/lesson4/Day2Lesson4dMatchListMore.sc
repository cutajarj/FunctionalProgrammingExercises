def howsTheList(l: List[Any]) = l match {
  case Nil => "List is empty"
  case Some(h) :: Nil => s"Option on the front with $h"
  case h :: Nil => s"List has one item, $h"
  case (h:String) :: (d:Double) :: Nil => s"List has two items, $h and $d"
  case h :: n :: Nil => s"List has two items, $h, $n"
  case h :: t => s"List has more than one item. Head is $h tail is $t"
}

howsTheList(List())
howsTheList(List(1))
howsTheList(List(1, 2, 3, 4, 5))
howsTheList(List(1, 2))
howsTheList(List(Some(1)))
howsTheList(List("Yo", 4.5))
