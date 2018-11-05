package com.cutajarjames.exercise1

class Distances {

  def allDistancesFurther(points: Array[(Int, Int)], min: Int): Seq[Double] = {
    for (i <- 0 until points.length;
         j <- i + 1 until points.length
         if distanceBetween(points(i), points(j)) > min)
      yield distanceBetween(points(i), points(j))
  }

  private def distanceBetween(p1: (Int, Int), p2: (Int, Int)): Double = {
    val (x1, y1) = p1
    val (x2, y2) = p2
    Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2))
  }

}
