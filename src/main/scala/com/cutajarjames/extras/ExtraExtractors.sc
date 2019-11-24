val double = 45.125

double match {
  case Decimal(number, fractional) =>
    s"Number is $number, fractional part is $fractional"
}

object Decimal{
  def unapply(d: Double): Option[(Int, Double)] =
    Some(d.toInt, d - d.toInt.toDouble)
}
