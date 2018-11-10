val distFromPorto = Map("Paris" -> 1200, "Rome" -> 1750, "Mumbia" -> 7900, "New York" -> 5400)

distFromPorto("Rome")

distFromPorto.map{case (city, dist) => city.toUpperCase -> dist}

val dist2 = distFromPorto + ("London" -> 1300)

distFromPorto.keys
dist2.keys

val dist3 = distFromPorto - "Rome"

distFromPorto.keys
dist2.keys
dist3.keys
