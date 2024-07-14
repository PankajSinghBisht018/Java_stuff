public class practical_2 {
    public static void main(String[] args) {
        // Arithmetic operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        // Relational operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b is " + (a > b));
        System.out.println("a < b is " + (a < b));
        System.out.println("a >= b is " + (a >= b));
        System.out.println("a <= b is " + (a <= b));
        System.out.println("a == b is " + (a == b));
        System.out.println("a != b is " + (a != b));
        // Logical operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y is " + (x && y));
        System.out.println("x || y is " + (x || y));
        System.out.println("!x is " + (!x));
        // Bitwise operators
        int num1 = 5, num2 = 3;
        System.out.println("\nBitwise Operators:");
        System.out.println("num1 & num2 is " + (num1 & num2));
        System.out.println("num1 | num2 is " + (num1 | num2));
        System.out.println("num1 ^ num2 is " + (num1 ^ num2));
        System.out.println("~num1 is " + (~num1));
        // Assignment operators
        int result = 10;
        result += 5;
        System.out.println("\nAssignment Operators:");
        System.out.println("result = " + result);
        // Unary operators
        int operand = 10;
        System.out.println("\nUnary Operators:");
        System.out.println("++operand is " + (++operand));
        System.out.println("--operand is " + (--operand));
        // Ternary operator
        int number = 5;
        String resultStr = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("\nTernary Operator:");
        System.out.println("Number " + number + " is " + resultStr);
    }
}
