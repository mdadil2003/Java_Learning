package com.database;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class DbConfig {
    Connection con;
    PreparedStatement s;
       public DbConfig()
       {
           try {
               Class.forName("com.mysql.cj.jdbc.Driver");
               con=DriverManager.getConnection(
                       "jdbc:mysql://localhost:3306/Application","root","MySQL");
           }catch (Exception e) {
               System.out.println("Failed to connect DB.");
           }
       }
       public Connection  getCon() {
           return con;
       }
}
