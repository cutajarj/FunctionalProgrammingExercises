trait Functor[F[_]] {
  def fmap[A, B](inst: F[A])(f: A => B): F[B]
}
trait Monad[F[_]] extends Functor[F] {
  def unit[A](a: => A): F[A]

  override def fmap[A, B](inst: F[A])(f: A => B): F[B] = fltMap(inst)(a => unit(f(a)))

  def fltMap[A, B](inst: F[A])(f: A => F[B]): F[B]
}

val optMon = new Monad[Option] {
  override def unit[A](a: => A): Option[A] = Option(a)

  override def fltMap[A, B](inst: Option[A])(f: A => Option[B]): Option[B] = inst match {
    case Some(x) => f(x)
    case _ => None
  }
}

val listMon = new Monad[List] {
  override def unit[A](a: => A): List[A] = List(a)

  override def fltMap[A, B](inst: List[A])(f: A => List[B]): List[B] = inst match {
    case h :: t => f(h) ::: fltMap(t)(f)
    case _ => Nil
  }
}

val l = List(4,2,3)
listMon.fltMap(l)(n => ("a" * n).toList)
