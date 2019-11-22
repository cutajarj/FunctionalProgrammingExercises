trait Monad[F[_]] {
  def unit[A](a: => A): F[A]

  def map[A, B](fa: F[A])(f: A => B): F[B] = flatMap(fa)(a => unit(f(a)))

  def flatMap[A, B](fa: F[A])(f: A => F[B]): F[B]

  def map2[A, B, C](fa: F[A], fb: F[B])(f: (A, B) => C): F[C] =
    flatMap(fa)(a => map(fb)(b => f(a, b)))
}

val optMon = new Monad[Option] {
  override def unit[A](a: => A) = Option(a)

  override def flatMap[A, B](fa: Option[A])(f: A => Option[B]) =
    fa.flatMap(f)
}

val opt1 = Option("a")
val opt2 = Option("z")
optMon.map2(opt1, opt2)(_+_)

val listMon = new Monad[List] {
  override def unit[A](a: => A) = List(a)

  override def flatMap[A, B](fa: List[A])(f: A => List[B]) =
    fa.flatMap(f)
}

val list1 = List("a", "b", "c")
val list2 = List("x", "y", "z")
listMon.map2(list1, list2)(_+_)