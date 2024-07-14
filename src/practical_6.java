public class practical_6 {  
    static int staticVar = 0;
    
    static void staticMethod() {
        System.out.println("Static method called.");
        System.out.println("Value of staticVar: " + staticVar);
    }

    public static void main(String[] args) {
        System.out.println("Initial value of staticVar: " + staticVar);
        staticMethod();
        staticVar = 10;
        System.out.println("Updated value of staticVar: " + staticVar);
        staticMethod();

        practical_6 obj1 = new practical_6();
        practical_6 obj2 = new practical_6();
        obj1.staticVar = 100;

        System.out.println("Value of staticVar for obj1: " + obj1.staticVar);
        System.out.println("Value of staticVar for obj2: " + obj2.staticVar);

        obj1.staticMethod();
        obj2.staticMethod();
    }
}
