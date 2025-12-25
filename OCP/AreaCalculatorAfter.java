package ict301.solid.ocp;

interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    private double width, height;
    public Rectangle(double w, double h) { this.width = w; this.height = h; }
    public double calculateArea() { return width * height; }
}

class Circle implements Shape {
    private double radius;
    public Circle(double r) { this.radius = r; }
    public double calculateArea() { return Math.PI * radius * radius; }
}

public class AreaCalculatorAfter {
    public double calculate(Shape shape) {
        return shape.calculateArea();
    }
}
