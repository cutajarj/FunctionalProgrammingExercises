package com.cutajarjames.exercise1

class Distances {

  def allDistancesFurther(points: Array[(Int, Int)], min: Int): Seq[Double] = {
    Seq(100.0)
  }

  private def distanceBetween(p1: (Int, Int), p2: (Int, Int)): Double = {
    val (x1, y1) = p1
    val (x2, y2) = p2
    Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2))
  }

}
