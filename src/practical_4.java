import java.util.Scanner;

public class practical_4 {
    public static void main(String[] args) {
        System.out.println("CGPA cal");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter 1");
            float a= sc.nextFloat();
            System.out.println("enter 2");
            float b=sc.nextFloat();
            System.out.println("enter 3");
            float c=sc.nextFloat();
            float cgpa=(a+b+c)/30;
            System.out.println(cgpa);
        }
    }

    }

