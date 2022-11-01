package com.student;
/*
@Author Sankhajit Roy
*/

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Student {   // main class

	public static void main(String[] args) {   // main method
		// creating scanner class object
		Scanner sc = new Scanner(System.in);
		// taking user input
		System.out.println("Enter student id:");
		int id = sc.nextInt();
		System.out.println("Enter student name:");
		String name = sc.next();

		try {
			// Creating connection
			Connection con = ConnectionHelper.con();
			PreparedStatement stm;
			String sql = "insert into student values(?,?)";
			stm = con.prepareStatement(sql);// preparing statement
			stm.setInt(1, id);// set the value
			stm.setString(2, name);// set the value

			stm.execute();// execute the query
			con.close();// close the connection
			System.out.println("value inserted successfully");
		} catch (Exception e) {
			System.out.println(e);
		}
		// close the scanner object
		sc.close();
	}

}
