val flights = List("Rome", "Paris", "Lisbon", "London")
val prices = List("110", "120", "80", "20")

val flightPrices = flights.zip(prices)

flightPrices.map(t => s"${t._1} costs ${t._2}")

flightPrices.map { case (f, p) => s"$f costs $p" }

flights.zipWithIndex

flights.zipWithIndex.filter(_._2 % 2 == 1)

