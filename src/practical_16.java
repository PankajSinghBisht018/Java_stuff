import com.example.package1.Interface1;
import com.example.package2.Interface2;

class MyClass implements Interface1, Interface2 {
    @Override
    public void method1() {
        System.out.println("Method 1 from Interface1");
    }

    @Override
    public void method2() {
        System.out.println("Method 2 from Interface2");
    }
}

public class practical_16 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.method1();
        myClass.method2();
    }
}

