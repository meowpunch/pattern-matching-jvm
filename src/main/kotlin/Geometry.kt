package main.kotlin

sealed interface Shape

data class Point(val x: Double, val y: Double) {}

data class Square(val topLeft: Point, val side: Double): Shape {}

data class Rectangle(val topLeft: Point, val height: Double, val width: Double): Shape {}

data class Circle(val center: Point, val radius: Double): Shape {}

class Geometry {
    val PI = 3.141592653589793

    fun area(shape: Shape): Double {
        return when(shape) {
            is Square -> shape.side * shape.side
            is Rectangle -> shape.height * shape.width
            is Circle -> PI * shape.radius * shape.radius
        }
    }
}
