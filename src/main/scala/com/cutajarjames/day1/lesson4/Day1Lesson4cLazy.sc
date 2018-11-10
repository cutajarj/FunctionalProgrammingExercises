val level = "info"
def debug(text: String, param: String): Unit =
  if (level == "debug") {
    println(text.replace("{}", param))
  }
def getUserBalance(username: String): String = {
  println("Reading balance from DB")
  "100 USD"
}

debug("James has {} in his balance",
  getUserBalance("James"))

def debug2(text: String, param: () => String): Unit =
  if (level == "debug") {
  println(text.replace("{}", param()))
}

debug2("James has {} in his balance",
  () => getUserBalance("James"))

def debug3(text: String, param: => String): Unit =
  if (level == "debug") {
  println(text.replace("{}", param))
}

debug3("James has {} in his balance",
  getUserBalance("James"))
