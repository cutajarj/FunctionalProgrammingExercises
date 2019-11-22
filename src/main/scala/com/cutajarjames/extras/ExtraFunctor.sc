val list1 = List("James", "Ruth")
val list2 = List("James", "Ruth")
list1.zip(list2)

trait Functor[F[_]] {
  def map[A, B](inst: F[A])(trans: A => B): F[B]

  def unpair[A, B](inst: F[(A, B)]): (F[A], F[B]) = (map(inst)(_._1), map(inst)(_._2))
}

val listFunctor = new Functor[List] {
  def map[A, B](lst: List[A])(f: A => B): List[B] = lst.map(f)
}

val optionFunctor = new Functor[Option] {
  def map[A, B](opt: Option[A])(f: A => B): Option[B] = opt.map(f)
}

val lst = List((1, 2), (2, 3), (3, 4), (4, 5), (5, 6))

listFunctor.unpair(lst)

val opt = Option(("James", "Sam"))

optionFunctor.unpair(opt)