class AreaCalculator {
    public static double calculateArea(double side) {
        return side * side;
    }
    public static double calculateArea(double length, double width) {
        return length * width;
    }
    public static double calculateArea(double base, double height, String shape) {
        if (shape.equalsIgnoreCase("triangle")) {
            return 0.5 * base * height;
        } else {
            System.out.println("Invalid shape provided.");
            return -1;
        }
    }
}
public class practical_10 {
    public static void main(String[] args) {
        double areaOfSquare = AreaCalculator.calculateArea(5.0);
        System.out.println("Area of square: " + areaOfSquare);

        double areaOfRectangle = AreaCalculator.calculateArea(4.0, 6.0);
        System.out.println("Area of rectangle: " + areaOfRectangle);

        double areaOfTriangle = AreaCalculator.calculateArea(3.0, 4.0, "triangle");
        System.out.println("Area of triangle: " + areaOfTriangle);
    }
}







