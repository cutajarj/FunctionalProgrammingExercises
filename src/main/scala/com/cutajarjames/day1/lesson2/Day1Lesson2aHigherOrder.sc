import java.util.Date

def wakeMeUpAfter(seconds: Int, f: String => Unit): Unit = {
  Thread.sleep(seconds * 1000)
  f(s"Time Now: ${System.currentTimeMillis}. Wake me UP")
}

wakeMeUpAfter(2, println)

def doSomething(str: String): Unit = {
  println(s"$str before you go go!")
}

wakeMeUpAfter(2, doSomething)

def wakeMeUpAfterV2(seconds: Int,
                  f: (String, Long) => Unit): Unit = {
  Thread.sleep(seconds * 1000)
  val time = System.currentTimeMillis
  f(s"Time Now: ${time}. Wake me UP", time)
}

def doSomething2(str: String, time: Long): Unit = {
  println(s"$str before you go go!")
  println(new Date(time))
}

wakeMeUpAfterV2(2, doSomething2)