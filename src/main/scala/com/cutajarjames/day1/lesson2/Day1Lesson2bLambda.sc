// "1,2" -> Int, Int
def parseAndExecute(number: String, f: (Int, Int) => Int): String = {
  val x = number.split(",")(0).toInt
  val y = number.split(",")(1).toInt
  val ans = f(x, y)
  s"The answer is $ans"
}

def add(x: Int, y: Int):Int = x + y

parseAndExecute("2,3", add)

parseAndExecute("2,3", (x, y) => x + y)

parseAndExecute("2,3", (x, y) => x * y)

parseAndExecute("2,3", _ * _)
