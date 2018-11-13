import scala.util.Try

val priceOnDay1 = "$230"
val priceOnDay2 = "NO STOCK"

def parsePrice(str:String): Double =
  str.replace("$", "").toDouble

parsePrice(priceOnDay1)
//parsePrice(priceOnDay2)

def parsePrice2(str:String): Option[Double] = try {
  Some(str.replace("$", "").toDouble)
}
catch {
  case e:Exception => None
}

parsePrice2(priceOnDay1)
parsePrice2(priceOnDay2)

def parsePrice3(str:String): Option[Double] =
  Try(str.replace("$", "").toDouble)
  .toOption

parsePrice3(priceOnDay1)
parsePrice3(priceOnDay2)

def parsePrice4(str:String): Try[Double] =
  Try(str.replace("$", "").toDouble)

parsePrice4(priceOnDay1)
parsePrice4(priceOnDay2)
