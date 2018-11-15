import scala.PartialFunction._

abstract class Expression(op1: Double, op2: Double)

case class Addition(op1: Double, op2: Double) extends Expression(op1, op2)

case class Subtraction(op1: Double, op2: Double) extends Expression(op1, op2)

case class Multiplication(op1: Double, op2: Double) extends Expression(op1, op2)

case class Division(op1: Double, op2: Double) extends Expression(op1, op2)

def solve(expression: Expression): Option[Double] = expression match {
  case Addition(a, b) => Some(a + b)
  case Subtraction(a, b) => Some(a - b)
  case Multiplication(a, b) => Some(a * b)
  case Division(a, b) if b != 0 => Some(a / b)
  case _ => None
}

solve(Division(5, 0))

def solve2(expression: Expression): Option[Double] = condOpt(expression) {
  case Addition(a, b) => a + b
  case Subtraction(a, b) => a - b
  case Multiplication(a, b) => a * b
  case Division(a, b) if b != 0 => a / b
}

solve2(Division(5, 0))

solve2(Division(5, 1))
