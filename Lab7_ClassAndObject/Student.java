package Lab7_ClassAndObject;

public class Student
{
    String name;
    int id;
    double grade;

    Student(String name, int id, double grade)
    {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    void displayStudents(Student studentArray[])
    {
        for(Student s : studentArray)
        {
            System.out.println("Name  : " + s.name);
            System.out.println("ID    : " + s.id);
            System.out.println("Grade : " + s.grade);
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Student studentArray[] = new Student[10];

        studentArray[0] = new Student("Adil",101,8.5);
        studentArray[1] = new Student("Ali",102,7.8);
        studentArray[2] = new Student("Aman",103,9.1);
        studentArray[3] = new Student("Rahul",104,8.0);
        studentArray[4] = new Student("Rohan",105,7.5);
        studentArray[5] = new Student("Neha",106,9.2);
        studentArray[6] = new Student("Priya",107,8.7);
        studentArray[7] = new Student("Karan",108,7.9);
        studentArray[8] = new Student("Ankit",109,8.3);
        studentArray[9] = new Student("Simran",110,9.0);

        studentArray[0].displayStudents(studentArray);
    }
}