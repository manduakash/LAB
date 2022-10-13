package LabOct13Problem_2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
	Logic logic = new Logic();
	Scanner scan = new Scanner(System.in);		//scanner class
	System.out.println("Enter String 1:");
	String input1 = scan.next();				//taking 1st input
 	System.out.println("Enter String 2:");
 	String input2 = scan.next();				//taking 2nd input
	
 	System.out.println("Lowercase of both input Strings		:	"+logic.stringsToLower(input1, input2));
 	System.out.println("Length of both input Strings		:	"+logic.lengthOfStrings(input1, input2));
 	System.out.println("String 1 is greater than String 2	:	"+logic.comparasionOfStrings(input1, input2));
 	System.out.println("Fist letter capitalizing of Strings 	:	"+logic.capitalizeOfStrings(input1, input2));
	
	scan.close();								//closing scanner
	}
}