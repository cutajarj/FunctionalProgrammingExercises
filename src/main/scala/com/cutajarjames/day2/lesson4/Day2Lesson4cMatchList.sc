def howsTheList(l: List[Any]) = l match {
  case Nil => "List is empty"
  case h :: Nil => s"List has one item, $h"
  case a :: b :: Nil => s"List has two items. $a and $b"
  case h :: t => s"List has more than two items. Head is $h tail is $t"
}

howsTheList(List())

howsTheList(List(1))

howsTheList(List(1,2))

howsTheList(List(1,2,3))

