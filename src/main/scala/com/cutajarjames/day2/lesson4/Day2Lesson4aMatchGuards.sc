def howHotIsWater(temp: Double): String = temp match {
  case x if x > 100 => "Boiling"
  case x if x > 40 => "Hot"
  case x if x > 20 => "Warm"
  case x if x > 0 => "Cold"
  case _ => "Freezing"
}

howHotIsWater(41)

howHotIsWater(21)

howHotIsWater(-1)

