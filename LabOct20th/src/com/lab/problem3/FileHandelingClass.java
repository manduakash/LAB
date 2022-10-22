package com.lab.problem3;

import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

public class FileHandelingClass {	//class
	
	public static void main(String[] args) throws IOException { //main class
		
		//creating new file
		FileWriter file = new FileWriter("C:\\Users\\91620\\OneDrive\\Desktop\\newfile.txt");
		
		//creating scanner object for taking input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter what you want to write into the file (file name : 'newfile.txt')");
		
		file.write(scan.next());	//taking input and saving into the file
		scan.close();				//closing the scanner class object
		file.close();				//closing the file object
		System.out.println("File has been created succefully");
	}
}
