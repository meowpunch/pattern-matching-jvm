package main.scala

sealed trait Shape

case class Point(x: Double, y: Double) {}

case class Square(topLeft: Point, side: Double) extends Shape {}

case class Rectangle(topLeft: Point, height: Double, width: Double) extends Shape {}

case class Circle(center: Point, radius: Double) extends Shape {}

class Geometry {
    val PI = 3.141592653589793

    def area(shape: Shape): Double = {
        shape match {
            case Square(_, s) => s * s
            case Rectangle(_, h, w) => h * w
            case Circle(_, r) => PI * r * r
        }
    }
}
