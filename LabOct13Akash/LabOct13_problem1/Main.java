package LabOct13_problem1;

import java.util.Scanner;

public class Main {//class for main method
	
	public static void main(String[] args) {//main method
		
		Logic logic = new Logic();					//logic class
		Scanner scan = new Scanner(System.in);		//scanner class
		System.out.println("Enter any integer range for executing this program:");
		logic.isMultipleOf3or5(scan.nextInt());		//passing range and invoking method
		scan.close();								//closing scanner
	}

}
