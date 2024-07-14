public class practical_7 {        
    private int value;

    public practical_7() {
        this.value = 0;
    }

    public practical_7(int value) {
        this.value = value;
    }

    public practical_7(int value1, int value2) {
        this.value = value1 + value2;
    }

    public void display() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        practical_7 obj1 = new practical_7();
        practical_7 obj2 = new practical_7(5);
        practical_7 obj3 = new practical_7(10, 20);
        obj1.display(); 
        obj2.display(); 
        obj3.display(); 
    }
}

