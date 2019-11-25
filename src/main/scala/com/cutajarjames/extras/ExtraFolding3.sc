val numbers = Array(5, 4, 3, 7, 2, 8)

numbers.fold(0)((sum, n) => sum + n)

val opt = Option("Text")
//val opt:Option[String] = None

opt.map(_.toUpperCase).getOrElse("default")

opt.fold("default")(_.toUpperCase)

val tempPrev = None //Option(20), Option(20)
val tempNew = 20 //21, 20
//Only send if name changes

tempPrev.fold(Option(tempNew))(tp => if (tp == tempNew) None else Option(tempNew))

tempPrev.flatMap(tp => if (tp == tempNew) None else Option(tempNew)).orElse(Option(tempNew))
