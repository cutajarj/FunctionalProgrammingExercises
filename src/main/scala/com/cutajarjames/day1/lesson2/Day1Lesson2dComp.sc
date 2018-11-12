def complainAbtTemp(temp: Int): String =
  if (temp > 20) "It is warm today" else "It is cold today"

for (i <- 0 to 10) println(i)

for (i <- 0 until 10) println(i)

for (i <- 15 until 25) println(complainAbtTemp(i))

val complaints = for (i <- 15 until 25) yield complainAbtTemp(i)

complaints(3)

for (i <- 1 to 3)
  for (j <- 1 to 3)
    println( s"$i:$j")

for(i <- 1 to 3; j <- 1 to 3) println(s"$i:$j")

for (i <- 1 to 3; j <- 1 to 3) yield s"$i:$j"

for (i <- 1 to 3; j <- 1 to 3; if i!=2 ) yield s"$i:$j"
