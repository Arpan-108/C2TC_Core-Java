package com.tnsif.daytwentythree;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	static Connection cn;
	public static Connection getCn(){
		
		try {
			//Load JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Diver Loaded Successfully...");

			//Establish a connection with database 
			cn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jn08", "root", "root@123");
			System.out.println("Connection");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return cn;
	}
	
	public static void closeConnection() throws SQLException {
		
		if(cn != null) {
			cn.close();
		}
	}
}
