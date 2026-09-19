package Lab7_ClassAndObject;

public class BubbleSort
{
    String name;
    int id;
    double grade;

    BubbleSort(String name, int id, double grade)
    {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    static void displayStudents(Student studentArray[])
    {
        for(Student s : studentArray)
        {
            System.out.println("Name  : " + s.name);
            System.out.println("ID    : " + s.id);
            System.out.println("Grade : " + s.grade);
            System.out.println();
        }
    }

    static void sortStudents(Student studentArray[])
    {
        for(int i = 0; i < studentArray.length - 1; i++)
        {
            for(int j = 0; j < studentArray.length - i - 1; j++)
            {
                if(studentArray[j].grade > studentArray[j + 1].grade)
                {
                    Student temp = studentArray[j];

                    studentArray[j] = studentArray[j + 1];

                    studentArray[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Student studentArray[] = new Student[10];

        studentArray[0] = new Student("Adil",101,8.5);
        studentArray[1] = new Student("Ali",102,7.2);
        studentArray[2] = new Student("Aman",103,9.1);
        studentArray[3] = new Student("Neha",104,6.8);
        studentArray[4] = new Student("Rohan",105,8.0);
        studentArray[5] = new Student("Priya",106,7.5);
        studentArray[6] = new Student("Karan",107,9.3);
        studentArray[7] = new Student("Ankit",108,6.9);
        studentArray[8] = new Student("Simran",109,8.7);
        studentArray[9] = new Student("Rahul",110,7.8);

        System.out.println("Before Sorting:");
        displayStudents(studentArray);

        sortStudents(studentArray);

        System.out.println("\nAfter Sorting (Ascending Order):");
        displayStudents(studentArray);
    }
}