package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {

		try {
			String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?userSSL=false";
			String user = "hbstudent";
			String pass = "HB_student_77099";
			
			System.out.println("Connecting to database: " + jdbcUrl);
			
			Connection myConn =
					DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Connection successful!");
		
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		
		
	}

}
