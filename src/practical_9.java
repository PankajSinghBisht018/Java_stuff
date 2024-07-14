// Parent class
class Car {
    void speed() {
        System.out.println("Speed of car 450km/h");
    }
}
class SuperCar extends Car {
    void model() {
        System.out.println("Bugatti Chiron Super Sport 300");
    }
}
public class practical_9 {
    public static void main(String[] args) {
        SuperCar mySuperCar = new SuperCar();
        mySuperCar.speed();  
        mySuperCar.model();  
    }
}
