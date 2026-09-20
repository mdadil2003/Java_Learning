package Lab8_Inheritance;
import java.util.Scanner;

interface College
{
    String COLLEGE_NAME = "C-DAC Noida";

    void getDetails();

    void showDetails();

    default void displayMessage()
    {
        System.out.println("Welcome to College Management System");
    }

    static void showCollegeInfo()
    {
        System.out.println("College Information System");
    }
}

class Teacher
{
    String name;
    String qualification;
}

class Department extends Teacher implements College
{
    int deptNo;
    String deptName;

    Scanner sc = new Scanner(System.in);

    public void getDetails()
    {
        System.out.print("Enter Teacher Name: ");
        name = sc.nextLine();

        System.out.print("Enter Qualification: ");
        qualification = sc.nextLine();

        System.out.print("Enter Department Name: ");
        deptName = sc.nextLine();

        if(deptName.equalsIgnoreCase("IT dept"))
        {
            deptNo = 10;
        }
        else if(deptName.equalsIgnoreCase("Management dept"))
        {
            deptNo = 20;
        }
        else
        {
            System.out.println("Not a Valid Record");
            System.exit(0);
        }
    }

    public void showDetails()
    {
        System.out.println("\nCollege Name : " + COLLEGE_NAME);
        System.out.println("Teacher Name : " + name);
        System.out.println("Qualification : " + qualification);
        System.out.println("Department No : " + deptNo);
        System.out.println("Department Name : " + deptName);
    }
}

public class CollegeManagementSystem
{
    public static void main(String[] args)
    {
        College.showCollegeInfo();

        Department d = new Department();

        d.displayMessage();

        d.getDetails();

        d.showDetails();
    }
}
