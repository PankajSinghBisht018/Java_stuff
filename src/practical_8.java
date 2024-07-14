public class practical_8 {
    static class Person {
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
    static class Student extends Person {
        private String major;
        public Student(String name, int age, String major) {
            super(name, age);
            this.major = major;
        }
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Major: " + major);
        }
    }
    static class Professor extends Person {
        private String department;

        public Professor(String name, int age, String department) {
            super(name, age);
            this.department = department;
        }
        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Department: " + department);
        }
    }
    public static void main(String[] args) {
        Student student = new Student("Pankaj", 20, "Computer Science");
        Professor professor = new Professor("Dr.Brave", 45, "Mathematics");
        System.out.println("--- Student Information ---");
        student.displayInfo();
        System.out.println("\n--- Professor Information ---");
        professor.displayInfo();
    }
}
