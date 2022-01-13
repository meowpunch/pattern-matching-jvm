package main.java;

sealed interface Shape {}

record Point(double x, double y) {}

record Square (Point topLeft, double side) implements Shape {}

record Rectangle (Point topLeft, double height, double width) implements Shape {}

record Circle (Point center, double radius) implements Shape {}

public class Geometry {
    public final double PI = 3.141592653589793;
    private static class NoSuchShapeException extends Exception {}

    public double areaOrigin(Object shape) throws NoSuchShapeException {
        if (shape instanceof Square) {
            Square s = (Square) shape;
            return s.side() * s.side();
        } else if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            return r.height() * r.width();
        } else if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            return PI * c.radius() * c.radius();
        }
        throw new NoSuchShapeException();
    }

    public double areaInstanceOf(Object shape) throws NoSuchShapeException {
        if (shape instanceof Square s) return s.side() * s.side();
        else if (shape instanceof Rectangle r) return r.height() * r.width();
        else if (shape instanceof Circle c) return PI * c.radius() * c.radius();
        throw new NoSuchShapeException();
    }

    public double area(Shape shape) throws NoSuchShapeException {
        return switch(shape) {
            case Square s -> s.side() * s.side();
            case Rectangle r -> r.height() * r.width();
            case Circle c -> PI * c.radius() * c.radius();
        };
    }
}