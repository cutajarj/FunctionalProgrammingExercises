val cities = List("Paris", "London", "Lisbon")

cities(1)

//cities(1) = "Rome"

val names = Array("James", "Paul", "Isabel")

names(1) = "Ruth"
names

cities.foreach(c => println(c))

cities.foreach(println(_))

cities.foreach(println)

