import scala.util.Try

for (i <- 1 to 10; j <- 1 to 10) yield j + i

1 to 10

(1 to 10).toList

val names = List("Ruth", "Isabel")
val fruits = List("apples", "oranges")

for (n <- names; f <- fruits) yield s"$n loves $f"

val name = "James"
val surname = "Cutajar"
val phone = "12345678"

for (n <- Option(name).filter(_.trim != "");
     s <- Option(surname).filter(_.trim != "").filter(_ != n);
     p <- Option(phone);
     pInt <- Try(p.toInt).toOption)
  yield s"Validated $n $s with phone number $p"

val phone2 = "12345678a"
val surname2 = "James"
