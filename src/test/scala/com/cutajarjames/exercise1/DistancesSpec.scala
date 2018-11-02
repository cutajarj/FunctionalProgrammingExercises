package com.cutajarjames.exercise1

import org.scalatest.{FlatSpec, Matchers}

class DistancesSpec extends FlatSpec with Matchers {


  it should "output an empty list if empty input" in {
    (new Distances).allDistancesFurther(Array(), 10) shouldEqual Seq()
  }

  it should "output an empty list if only one input" in {
    (new Distances).allDistancesFurther(Array((1,2)), 10) shouldEqual Seq()
  }

  it should "output only one distance for two points" in {
    (new Distances).allDistancesFurther(Array((0,0), (30,40)), 10).map(math.round(_).toInt) shouldEqual Seq(50)
  }

  it should "output only an empty list for two points if min distance is smaller" in {
    (new Distances).allDistancesFurther(Array((0,0), (30,40)), 100) shouldEqual Seq()
  }

  it should "output 10 distance points for 5 points" in {
    val inputs = Array((0,0), (30,40), (25,3), (78,22), (97,12))
    (new Distances).allDistancesFurther(inputs, -1).map(math.round(_).toInt) shouldEqual Seq(50, 25, 81, 98, 37, 51, 73, 56, 73, 21)
  }

  it should "output 9 distance points for 5 points if one gets filtered" in {
    val inputs = Array((0,0), (30,40), (25,34), (78,22), (97,12))
    (new Distances).allDistancesFurther(inputs, 10).map(math.round(_).toInt) shouldEqual Seq(50, 42, 81, 98, 51, 73, 54, 75, 21)
  }

  it should "output empty list for 5 points if all gets filtered" in {
    val inputs = Array((0,0), (30,40), (25,34), (78,22), (97,12))
    (new Distances).allDistancesFurther(inputs, 100).map(math.round(_).toInt) shouldEqual Seq()
  }

}
