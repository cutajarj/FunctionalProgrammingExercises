package com.cutajarjames.exercise6

abstract class Expression(op1: Double, op2: Double)

case class Addition(op1: Double, op2: Double) extends Expression(op1, op2)

case class Subtraction(op1: Double, op2: Double) extends Expression(op1, op2)

case class Multiplication(op1: Double, op2: Double) extends Expression(op1, op2)

case class Division(op1: Double, op2: Double) extends Expression(op1, op2)

class SimpleSolver {
  def solve(expression: Expression): Option[Double] = expression match {
    case Addition(a, b) => Some(a + b)
    case Subtraction(a, b) => Some(a - b)
    case Multiplication(a, b) => Some(a * b)
    case Division(a, 0) => None
    case Division(a, b) => Some(a / b)
  }
}
