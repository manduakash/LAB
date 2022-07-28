/* @author AKASH SINGH 
 * Problem statement 1:
 * */
package LabWeek6;

public class LabWeek6_Q1 {	
	
	//main method
	public static void main(String[] args) { 
		
		//creating a string object 
		String str = "Welcome to Java World";
			
		System.out.println("character at index 5th: "+str.charAt(5)); 				// 5th index character
		
		System.out.println("comparing: "+ "Welcome".compareToIgnoreCase(str));		// lexicographically camparasion of string
		
		System.out.println("concatenating: "+str+"Let us learn");	 				// concatenating with "str"
		
		System.out.println("first occurance of \"a\" at index: "+str.indexOf('a')); // first occurance of character "a"
		
		System.out.println("replacing all a(s) with e(s):- "+str.replace('a', 'e'));// replacing character a(s) with e(s) 
	
		System.out.println("index 4 to 10 characters:- "+str.substring(4, 10));		// characters from index 4 to 10
	
		System.out.println("Lowercasing of str:- "+ str.toLowerCase()); 			// lowercase of "str" 
	}

}
