package com.tnsif.daytwentytwo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JDBCDemo {
	public static void main(String args[]) {
		
		try {
			//Load JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Diver Loaded Successfully...");
			
			//Establish a connection with database 
			Connection cn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jn08","root","root@123");
			System.out.println("Connection Established Successfully...");
			System.out.println("________________________________________________________________");
			
			//creating statement
			Statement st= cn.createStatement();
			ResultSet rs= st.executeQuery("Select * from Student");
			
			while(rs.next()) {
				
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
			}
			System.out.println("________________________________________________________________");

			//Terminate the connection
			cn.close();
			System.out.println("Connection Terminated Successfully...");
			System.out.println("________________________________________________________________");
		} 
		catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
}
