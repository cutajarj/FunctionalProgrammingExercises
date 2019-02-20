package com.cutajarjames.exercise6

abstract class Expression(op1: Double, op2: Double)

case class Addition(op1: Double, op2: Double) extends Expression(op1, op2)

case class Subtraction(op1: Double, op2: Double) extends Expression(op1, op2)

case class Multiplication(op1: Double, op2: Double) extends Expression(op1, op2)

case class Division(op1: Double, op2: Double) extends Expression(op1, op2)

/**
  * Implement this function accepting an expression class class and returning the
  * answer if the expression is defined
  *
  *
  * Examples:
  *
  * solve(Addition(1,1) should return Some(2)
  * solve(Multiplication(3,2) should return Some(6)
  * solve(Division(3,0) should return None
  */
class SimpleSolver {
  def solve(expression: Expression): Option[Double] = Some(0.0)
}
