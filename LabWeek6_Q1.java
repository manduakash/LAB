/* @author AKASH SINGH 
 * Problem statement 1,2 and 3:
 * */
package LabWeek6;

public class LabWeek6_Q1 {	
	
	//main method
	public static void main(String[] args) { 
		
		//PROBLEM STATEMENT 1:
		System.out.println("PROBLEM STATEMENT 1:");
		//creating a string object 
		String str = "Welcome to Java World";
			
		System.out.println("character at index 5th: "+str.charAt(5)); 			// 5th index character
		
		System.out.println("comparing: "+ "Welcome".compareToIgnoreCase(str));		// lexicographically camparasion of string
		
		System.out.println("concatenating: "+str+"Let us learn");	 		// concatenating with "str"
		
		System.out.println("first occurance of \"a\" at index: "+str.indexOf('a')); 	// first occurance of character "a"
		
		System.out.println("replacing all a(s) with e(s):- "+str.replace('a', 'e'));	// replacing character a(s) with e(s) 
	
		System.out.println("index 4 to 10 characters:- "+str.substring(4, 10));		// characters from index 4 to 10
	
		System.out.println("Lowercasing of str:- "+ str.toLowerCase()); 		// lowercase of "str" 
	
		//PROBLEM STATEMENT 2:
		System.out.println("\n\nPROBLEM STATEMENT 2:");
	
		StringBuffer sb = new StringBuffer("This is StringBuffer ");					// instantiating stringBuffer object
		
		System.out.println(sb.append("This is sample program"));					// adding string to existing string
		
		System.out.println(sb.insert(21, "Object"));							// inseting string at 21th position
		
		System.out.println(sb.reverse());								// reversing string 
		
		System.out.println(sb.replace(14, 20, "Builder"));	
	
		
		//PROBLEM STATEMENT 3:
		System.out.println("\n\nPROBLEM STATEMENT 3:");
		
		//creating a string object
		String str1 = "C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE"; 			// using double back slaces for escape sequence
		String newStr = str1.replace('\\', ' ');				// replacing "\" with whitespaces because, we can't use \ with split
		
		String[] arr = newStr.split(" "); 					// spliting all elements and storing into array
		int length = arr.length;
		
		System.out.println("Drive: " +arr[0]+ "\\");				// printing first element in 'Drive:'
		
		// printing middle elements using loop
		System.out.print("Folders: ");
		for(int i=1; i<length-1;i++) {
			System.out.print(arr[i]+" || ");							
		}
		System.out.println("\nFile: "+arr[length-1]);
	}

}
