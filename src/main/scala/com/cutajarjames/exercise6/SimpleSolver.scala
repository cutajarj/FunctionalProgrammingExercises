package com.cutajarjames.exercise6

abstract class Expression(op1: Double, op2: Double)

case class Addition(op1: Double, op2: Double) extends Expression(op1, op2)

case class Subtraction(op1: Double, op2: Double) extends Expression(op1, op2)

case class Multiplication(op1: Double, op2: Double) extends Expression(op1, op2)

case class Division(op1: Double, op2: Double) extends Expression(op1, op2)

class SimpleSolver {
  def solve(expression: Expression): Option[Double] = Some(0.0)
}
