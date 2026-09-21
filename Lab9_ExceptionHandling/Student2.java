package Lab9_ExceptionHandling;

public class Student2 {
    String name;
    int age;
    String course;
    Student2() {
        this("Saqib");
        System.out.println("Default Constructor Called");
    }
    Student2(String name) {
        this(name, 20);
        System.out.println("One Parameter Constructor Called");
    }
    Student2(String name, int age) {
        this(name, age, "PG-DAC");
        System.out.println("Two Parameter Constructor Called");
    }
    Student2(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
        System.out.println("Three Parameter Constructor Called");
    }
    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Course : " + course);
    }
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("\nStudent Details:");
        s.display();
    }
}
