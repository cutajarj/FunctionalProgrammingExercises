trait Functor[F[_]] {
  def fmap[A, B](inst: F[A])(f: A => B): F[B]
}

val optionFunctor = new Functor[Option] {
  def fmap[A, B](opt: Option[A])(f: A => B): Option[B] = opt match {
    case None => None
    case Some(x) => Some(f(x))
  }
}

val listFunctor = new Functor[List] {
  def fmap[A, B](list: List[A])(f: A => B): List[B] = list match {
    case Nil => Nil
    case h :: t => f(h) :: fmap(t)(f)
  }
}

val lst = List(1, 2, 3, 4, 5)
//val lst = List[Int]()

listFunctor.fmap(lst)(_ + 1)
