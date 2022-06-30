//@Author Akash Singh
//Java program to check Factorial Number

import java.util.*; //using for scanner class

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println("Enter a number to check Factorial number");
		
		//taking input from user
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		//logic part
		int fact = 1;
		
		for(int i=n; i>=1; i--) {
			fact = fact*i;
		}
			
		
		//output
		System.out.println("The factorial of "+n+" is "+fact);
		
	
	}

}
