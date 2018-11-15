package com.cutajarjames.exercise6

import org.scalatest.{FlatSpec, Matchers}

class SimpleSolverSpec extends FlatSpec with Matchers {
  it should "be able to do 3 plus 2" in {
    (new SimpleSolver).solve(Addition(3,2)) shouldEqual Some(5.0)
  }

  it should "be able to do 3 times 2" in {
    (new SimpleSolver).solve(Multiplication(3,2)) shouldEqual Some(6.0)
  }

  it should "be able to do 3 minus 2" in {
    (new SimpleSolver).solve(Subtraction(3,2)) shouldEqual Some(1.0)
  }

  it should "be able to do 3 div 2" in {
    (new SimpleSolver).solve(Division(3,2)) shouldEqual Some(1.5)
  }

  it should "be able to do 3 div 0 by return None" in {
    (new SimpleSolver).solve(Division(3,0)) shouldEqual None
  }
}
