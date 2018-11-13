val middleName1:Option[String] = Option("John")

val middleName2:Option[String] = None

middleName1.foreach(println)

middleName2.foreach(println)

Option("John").filter(_ == "John").foreach(println)

Option("James").filter(_ == "John").foreach(println)

def middleNameOpt(name: String):Option[String] =
  Option(name).map(_.trim).filter(_ != "")

middleNameOpt("James")

middleNameOpt(null)

middleNameOpt("  ")

middleNameOpt(" John ")
