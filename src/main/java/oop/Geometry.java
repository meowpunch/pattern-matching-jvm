package main.java.oop;

sealed interface Shape {
    double area();
}

record Point(double x, double y) {}

record Square (Point topLeft, double side) implements Shape {
    public double area() {return side * side;}
}

record Rectangle (Point topLeft, double height, double width) implements Shape {
    public double area() {return height * width;}
}

record Circle (Point center, double radius) implements Shape {
    static final double PI = 3.141592653589793;
    public double area() {return PI * radius * radius;}
}

public class Geometry {
}
