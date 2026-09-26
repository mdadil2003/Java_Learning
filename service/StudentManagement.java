package com.service;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Admin");
            System.out.println("2. Stundent");
            System.out.println("3. Exit");
            System.out.println("Enter the choice");
            choice=s.nextInt();
            switch(choice)
            {
                case 1:System.out.println("====Welcome to Admin services=============");
                    System.out.println("1.Add");
                    System.out.println("2.Delete");
                    System.out.println("3. Update");
                    System.out.println("4. View");

                    int c1=s.nextInt();
                    switch(c1)
                    {
                        case 1:
                            try
                            {
                                AdminService e=new AdminService();
                                System.out.println("Enter Empid");
                                e.empid=s.nextInt();
                                System.out.println("Enter employee name");
                                e.name=s.next();
                                System.out.println("Enter employee email");
                                e.email=s.next();
                                System.out.println("Enter employee password");
                                e.password=s.next();

                                e.addData(e.empid,e.name, e.email,e.password);
                                e.viewAllData();

                            }catch(Exception e)
                            {
                                System.out.println("invalid entry");
                            }
                            break;
                        case 2:
                            try
                            { AdminService e=new AdminService();
                                System.out.println("enter empid to delete");
                                e.empid=s.nextInt();

                                e.deleteData(e.empid);
                                e.viewAllData();

                            }
                            catch(Exception e)
                            {
                                System.out.println("Invalid entry");
                            }
                            break;
                        case 3:
                            System.out.println("1. Update name");
                            System.out.println("2.Update email");
                            int c2=s.nextInt();
                            switch(c2)
                            {
                                case 1:
                                    AdminService e=new AdminService();
                                    System.out.println("Enter empid");
                                    e.empid=s.nextInt();
                                    System.out.println("Enter ename");
                                    e.name=s.next();

                                    e.updateName(e.empid, e.name);
                                    e.viewAllData();
                                    break;
                                case 2:
                                    AdminService e1=new AdminService();
                                    System.out.println("Enter empid");
                                    e1.empid=s.nextInt();
                                    System.out.println("Enter emp emial");
                                    e1.email=s.next();

                                    e1.updateEmail(e1.empid, e1.email);
                                    e1.viewAllData();
                                    break;
                            }
                            break;
                        case 4:
                            AdminService e=new AdminService();

                            e.viewAllData();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("=======Welcome to Student Services===========");
                    System.out.println("1.Add");
                    System.out.println("2.Delete");
                    System.out.println("3. Update");
                    System.out.println("4. View");
                    int c2=s.nextInt();
                    switch(c2)
                    {
                        case 1:
                            try
                            {
                                StudentService e=new StudentService();
                                System.out.println("Enter rollno");
                                e.rollno=s.nextInt();
                                System.out.println("Enter student name");
                                e.name=s.next();
                                System.out.println("Enter student address");
                                e.address=s.next();
                                System.out.println("Enter student course");
                                e.course=s.next();
                                System.out.println("Enter student email");
                                e.email=s.next();
                                System.out.println("Enter student password");
                                e.password=s.next();

                                e.addData(e.rollno,e.name,e.address,e.course,e.email,e.password);
                                e.viewAllData();
                            }catch(Exception e)
                            {
                                System.out.println("invalid entry");
                            }
                            break;
                        case 2:
                            try
                            { StudentService e=new StudentService();
                                System.out.println("enter rollno to delete");
                                e.rollno=s.nextInt();

                                e.deleteData(e.rollno);
                                e.viewAllData();

                            }
                            catch(Exception e)
                            {
                                System.out.println("Invalid entry");
                            }
                            break;
                        case 3:
                            System.out.println("1. Update name");
                            System.out.println("2.Update email");
                            int c3=s.nextInt();
                            switch(c3)
                            {
                                case 1:
                                    StudentService e=new StudentService();
                                    System.out.println("Enter rollno");
                                    e.rollno=s.nextInt();
                                    System.out.println("Enter student name");
                                    e.name=s.next();

                                    e.updateName(e.rollno,e.name);
                                    e.viewAllData();
                                    break;
                                case 2:
                                    StudentService e1=new StudentService();
                                    System.out.println("Enter rollno");
                                    e1.rollno=s.nextInt();
                                    System.out.println("Enter student address");
                                    e1.address=s.next();

                                    e1.updateAddress(e1.rollno, e1.address);
                                    e1.viewAllData();
                                    break;
                            }
                            break;
                        case 4:
                            StudentService e=new StudentService();

                            e.viewAllData();
                            break;

                    }
                    break;
                case 3:System.exit(0);
                    System.out.println("Done & Dusted");
                    break;
            }

        }while(choice!=4);
        s.close();
    }
}