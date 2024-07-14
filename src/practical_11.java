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
class CollegeStudent extends Student {
    private int year;

    public CollegeStudent(String name, int age, String major, int year) {
        super(name, age, major);
        this.year = year;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Year: " + year);
    }
}
public class practical_11 {
    public static void main(String[] args) {
        CollegeStudent collegeStudent = new CollegeStudent("pankaj", 20, "Computer Science", 2);
        collegeStudent.displayInfo();
    }
}
