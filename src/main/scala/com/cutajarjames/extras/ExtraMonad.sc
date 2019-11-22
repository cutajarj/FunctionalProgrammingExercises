val list1 = List("a", "b", "c")

val list2 = List("x", "y", "z")

list1.flatMap(a => list2.map(b => a + b))

val opt1 = Option("a")
val opt2 = Option("z")

opt1.flatMap(a => opt2.map(b => a + b))

def map2[A, B, C](optA: Option[A], optB: Option[B])(f: (A, B) => C): Option[C] =
  optA.flatMap(a => optB.map(b => f(a, b)))

def map2[A, B, C](listA: List[A], listB: List[B])(f: (A, B) => C): List[C] =
  listA.flatMap(a => listB.map(b => f(a, b)))

map2(list1, list2)(_+_)
map2(opt1, opt2)(_+_)

//Anything that give us this wrapping (unit) and unwrapping
//And we can now add more functions to it, like the map 2
//Monad is a Functor, but a functor is not a Monad