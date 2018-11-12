import scala.collection.mutable.ArrayBuffer

val names = ArrayBuffer("Jose", "Paul", "Isabel")

names += "Ruth"

names

val namesList = List("Jose", "Paul", "Isabel")

//namesList += "Ruth"

val namesList2 = namesList :+ "Ruth"
namesList

val namesList3 = "Ruth" +: namesList

val namesOther = List("Judith", "Michelle")

namesList :+ namesOther
namesList ::: namesOther
