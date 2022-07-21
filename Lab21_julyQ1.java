//@author Akash Singh
//Lab 21 july Question no. 1: checking an array contains a specific value or not.
package Lab;

import java.util.Scanner;

public class Lab21_julyQ1 {		//class

	public static void main(String[] args) {	//main method
		
		Scanner scan = new Scanner(System.in); 					//instantiating scanner object for user input
		
		System.out.println("Enter the size of array:");
		int n=scan.nextInt();							//taking user input for array size 
		
		// instantiating and declaring array size 
		int[] arr = new int[n] ;
		
		
		System.out.println("\nEnter the element that your want to check:");
		int findValue = scan.nextInt();						//taking user input for checking 
		
		System.out.println("\nEnter the elements of array:");
		for (int i = 0; i < n; i++) {
			arr[i]=scan.nextInt();						//taking user input for array items
		}
		
		scan.close(); 								//closing input stream
		
		// logic
		int found = 0;								// counter variable
		
		for (int i = 0; i < arr.length; i++) {					//loop for searching
			if(arr[i] == findValue) {		
				found=1;						//updating counter variable
				break;
			}
			else {
				found=0;					
			}
		}
		
		System.out.print("\nThe value "+findValue+" is ");
		
		// checking counter variable
		if(found==1) {
			System.out.println("Found!");
		}else {
			System.out.println("Not found!");
		}
			
		
	}

}
