
interface Calculator {
    double calculate(double num1, double num2);
}
class Addition implements Calculator {
    @Override
    public double calculate(double num1, double num2) {
        return num1 + num2;
    }
}
class Subtraction implements Calculator {
    @Override
    public double calculate(double num1, double num2) {
        return num1 - num2;
    }
}
class Multiplication implements Calculator {
    @Override
    public double calculate(double num1, double num2) {
        return num1 * num2;
    }
}
class Division implements Calculator {
    @Override
    public double calculate(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero");
            return Double.NaN; // Not a Number
        }
        return num1 / num2;
    }
}
public class practical_13 {
    public static void main(String[] args) {
        double num1 = 10.0;
        double num2 = 5.0;
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();
        System.out.println("Addition: " + addition.calculate(num1, num2));
        System.out.println("Subtraction: " + subtraction.calculate(num1, num2));
        System.out.println("Multiplication: " + multiplication.calculate(num1, num2));
        System.out.println("Division: " + division.calculate(num1, num2));
    }
}


