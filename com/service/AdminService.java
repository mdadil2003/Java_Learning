package com.service;
import com.database.*;
import java.sql.*;
public class AdminService {
    int empid;
    String name;
    String email;
    String password;
    PreparedStatement s;
    Connection s1;


    public void addData(int empid, String name, String email, String password) throws Exception {
        try
        {
            DbConfig e=new DbConfig();
            s1=e.getCon();
            s=s1.prepareStatement("Insert into admin values(?,?,?,?)");
            s.setInt(1,empid);
            s.setString(2,name);
            s.setString(3, email);
            s.setString(4, password);
            s.execute();


        }catch(Exception e) {
            System.out.println("Invalid Entry");
        }

    }
    public void deleteData(int empid) throws Exception
    {
        try
        {
            DbConfig e=new DbConfig();
            s1=e.getCon();
            s=s1.prepareStatement("delete from admin where empid=?");
            s.setInt(1, empid);
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
            s=s1.prepareStatement("select * from admin");
            ResultSet rs=s.executeQuery();
            while (rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" ");
            }
        }catch(Exception e)
        {
            System.out.println("Invalid Entry");
        }
    }
    public void updateName(int empid, String name)
    {
        try
        {
            DbConfig e=new DbConfig();
            s1=e.getCon();
            s=s1.prepareStatement("update admin set name=? where empid=?");
            s.setString(1, name);
            s.setInt(2,empid);
            s.execute();
        }catch(Exception e)
        {
            System.out.println("Invalid Entry");
        }
    }
    public void updateEmail(int empid, String email)
    {
        try
        {
            DbConfig e=new DbConfig();
            s1=e.getCon();
            s=s1.prepareStatement("update admin set email=? where empid=?");
            s.setString(1, email);
            s.setInt(2,empid);
            s.execute();
        }catch(Exception e)
        {
            System.out.println("Invalid Entry");
        }
    }

}
