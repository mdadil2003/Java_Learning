package com.service;
import java.sql.ResultSet;
import com.database.*;
import java.sql.*;
import java.sql.Connection;
public class StudentService {
    int rollno;
    String name;
    String address;
    String course;
    String email;
    String password;
    PreparedStatement s;
    Connection s1;

    public void addData(int rollno, String name, String address, String course, String email, String password) throws Exception {
        try
        {
            DbConfig e=new DbConfig();
            s1=e.getCon();
            s=s1.prepareStatement("Insert into student values(?,?,?,?,?,?)");
            s.setInt(1,rollno);
            s.setString(2,name);
            s.setString(3,address);
            s.setString(4,course);
            s.setString(5, email);
            s.setString(6, password);
            s.execute();

        }catch(Exception e) {
            System.out.println("Invalid Entry or something");
        }
    }
    public void deleteData(int rollno) throws Exception
    {
        try
        {
            DbConfig e=new DbConfig();
            s1=e.getCon();
            s=s1.prepareStatement("delete from student where rollno=?");
            s.setInt(1, rollno);
            s.execute();
        }catch(Exception e)
        {
            System.out.println("wrong data entered");
        }
    }
    public void viewAllData()
    {
        try {
            DbConfig e=new DbConfig();
            s1=e.getCon();
            s=s1.prepareStatement("select * from student");
            ResultSet rs=s.executeQuery();
            while (rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" ");
            }
        }catch(Exception e)
        {
            System.out.println("Invalid Entry");
        }
    }
    public void updateName(int rollno, String name)
    {
        try
        {
            DbConfig e=new DbConfig();
            s1=e.getCon();
            s=s1.prepareStatement("update student set name=? where rollno=?");
            s.setString(1, name);
            s.setInt(2,rollno);
            s.execute();
        }catch(Exception e)
        {
            System.out.println("Invalid Entry");
        }
    }
    public void updateAddress(int rollno, String address)
    {
        try
        {
            DbConfig e=new DbConfig();
            s1=e.getCon();
            s=s1.prepareStatement("update student set address=? where rollno=?");
            s.setString(1, address);
            s.setInt(2,rollno);
            s.execute();
        }catch(Exception e)
        {
            System.out.println("Invalid Entry");
        }
    }
}