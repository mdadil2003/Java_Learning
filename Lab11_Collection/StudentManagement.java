package Lab11_Collection;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int rollNo;
    private String name;
    private String course;
    private double marks;
    private String email;
    public Student(int rollNo, String name, String course, double marks, String email) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.marks = marks;
        this.email = email;
    }
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public double getMarks() {
        return marks;
    }

    public String getEmail() {
        return email;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void display() {
        System.out.println("-----------------------------------");
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("Course      : " + course);
        System.out.println("Marks       : " + marks);
        System.out.println("Email       : " + email);
    }
}

public class StudentManagement {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void addStudent() {

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        students.add(new Student(roll, name, course, marks, email));

        System.out.println("Student Added Successfully.");
    }
    static Student searchStudent(int roll) {

        for (Student s : students) {
            if (s.getRollNo() == roll) {
                return s;
            }
        }
        return null;
    }
    static void updateStudent() {

        System.out.print("Enter Roll Number to Update: ");
        int roll = sc.nextInt();
        sc.nextLine();

        Student s = searchStudent(roll);

        if (s == null) {
            System.out.println("Student Not Found.");
            return;
        }

        System.out.print("Enter New Name: ");
        s.setName(sc.nextLine());

        System.out.print("Enter New Course: ");
        s.setCourse(sc.nextLine());

        System.out.print("Enter New Marks: ");
        s.setMarks(sc.nextDouble());
        sc.nextLine();

        System.out.print("Enter New Email: ");
        s.setEmail(sc.nextLine());

        System.out.println("Student Updated Successfully.");
    }

    // Delete Student
    static void deleteStudent() {

        System.out.print("Enter Roll Number to Delete: ");
        int roll = sc.nextInt();

        Student s = searchStudent(roll);

        if (s != null) {
            students.remove(s);
            System.out.println("Student Deleted Successfully.");
        } else {
            System.out.println("Student Not Found.");
        }
    }
    static void displayAllStudents() {

        if (students.isEmpty()) {
            System.out.println("No Student Records Found.");
            return;
        }

        for (Student s : students) {
            s.display();
        }
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Display All Students");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();

                    Student s = searchStudent(roll);

                    if (s != null)
                        s.display();
                    else
                        System.out.println("Student Not Found.");
                    break;

                case 3:
                    updateStudent();
                    break;

                case 4:
                    deleteStudent();
                    break;

                case 5:
                    displayAllStudents();
                    break;

                case 6:
                    System.out.println("Thank You.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);
    }
}