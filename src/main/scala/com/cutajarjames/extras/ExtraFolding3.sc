val numbers = Array(5, 4, 3, 7, 2, 8)

numbers.fold(0)((sum, n) => sum + n)

val opt = Option("Text")
//val opt:Option[String] = None

opt.map(_.toUpperCase).getOrElse("default")

opt.fold("default")(_.toUpperCase)
