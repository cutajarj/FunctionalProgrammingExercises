package com.cutajarjames.exercise1

/**
  * Write a function that computes all the combinations of distances in the list of points provided
  * and filter out any distances that have a distance longer than the min parameter.
  *
  * The input to the function is s list of Pairs, containing the x and y coordinates.
  * The function should start from the first point in the list and compute the distance to all the others
  * Then it should pick the next, and do the same, skipping any previous distances already computed.
  *
  * For example if the input has a list of points [a,b,c,d] it should output
  * [distanceBetween(a,b), distanceBetween(a,c), distanceBetween(a,d),
  *  distanceBetween(b,c), distanceBetween(b,d), distanceBetween(c,d)]
  *
  */
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
