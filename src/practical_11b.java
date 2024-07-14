class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Student extends Person {
    private String major;
    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Major: " + major);
    }
}
class Staff extends Person {
    private String department;
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
public class practical_11b {
    public static void main(String[] args) {
        Student student = new Student("Pankaj", 20, "Computer Science");
        Staff staff = new Staff("Mr.XYZ", 35, "Administration");
        System.out.println("--- Student Information ---");
        student.displayInfo();
        System.out.println("\n--- Staff Information ---");
        staff.displayInfo();
    }
}
