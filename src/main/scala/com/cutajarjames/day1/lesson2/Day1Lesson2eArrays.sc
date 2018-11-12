val seasons = Array("Spring", "Summer", "Autumn", "Winter")

seasons(2)

seasons(2) = "Fall"

println(seasons)

println(seasons.mkString(", "))

val tuple = (120, 250)
tuple._1
tuple._2

val (x,y) = tuple

val cords = Array((100,200), (300, 400))
cords(1)._1
