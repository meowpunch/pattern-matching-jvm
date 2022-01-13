package main.scala

trait Expr

case class Number(n: Int) extends Expr
case class Negative(e: Expr) extends Expr
case class Sum(e1: Expr, e2:Expr) extends Expr
case class Multiply(e1: Expr, e2:Expr) extends Expr

object DeconstructionPatterns {
    def main(args: Array[String]): Unit = {
        val e: Expr = Multiply(Negative(Number(0)), Sum(Number(1), Number(1)))
        println(eval(e))
    }

    def eval(expr: Expr): Int =
        expr match {
            case Number(n) => n
            case Negative(e) => -eval(e)
            case Sum(e1: Expr, e2: Expr) => eval(e1) + eval(e2)
            case Multiply(e1, e2) => eval(e1) * eval(e2)
        }
}
