val waterTemps = List(10, 30, 25, -1, -5, 104, 70)

waterTemps
  .map(t => if (t < 1) "frozen"
  else if (t > 99) "vapour"
  else "liquid")

waterTemps
  .map(t => if (t < 1) t -> "frozen"
  else if (t > 99) t -> "vapour"
  else t -> "liquid")

val tempStates = waterTemps
  .map(t => if (t < 1) t -> "frozen"
  else if (t > 99) t -> "vapour"
  else t -> "liquid").toMap

tempStates(30)
