public class practical_15 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            // Accessing an index that is out of bounds
            int result = numbers[5]; // This will cause an ArrayIndexOutOfBoundsException
            System.out.println("Result: " + result); // This line will not be executed
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
            
            try {
                // Trying to perform another risky operation
                String str = null;
                System.out.println(str.length()); // This will cause a NullPointerException
                System.out.println("This line will not be executed");
            } catch (NullPointerException e2) {
                System.out.println("Caught NullPointerException inside nested try block");
            }
        }
    }
}


