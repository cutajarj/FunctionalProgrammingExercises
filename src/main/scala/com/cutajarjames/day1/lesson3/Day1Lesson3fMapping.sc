val cities = List("Paris", "London", "Lisbon")

cities.map(c => c.toUpperCase())

cities.filter(_.length > 4).map(_.toUpperCase)

val citiesOther = List("PARIS", "Valletta", "Madrid", "Lisbon")

cities.filter(c => citiesOther.contains(c))

cities.map(_.toUpperCase)
  .filter(c => citiesOther.map(_.toUpperCase).contains(c))

cities.filter(c =>
  citiesOther.exists(_.toUpperCase == c.toUpperCase()))

cities.map(_.toUpperCase)
  .intersect(citiesOther.map(_.toUpperCase))
