abstract class Shape {
    private String name;
    public Shape(String name) {
        this.name = name;
    }
    public abstract double getArea();
    public final void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Area: " + getArea());
    }
}

class Circle extends Shape {
    private double radius;
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return length * width;
    }
}
public class practical_12 {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 5);
        Rectangle rectangle = new Rectangle("Rectangle", 4, 6);
        circle.printDetails();
        System.out.println(); // Empty line for separation
        rectangle.printDetails();
    }
}
