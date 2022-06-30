//@Author Akash Singh
//Java program to check Prime Number

import java.util.*; //using for scanner class

public class IsPrime {

	public static void main(String[] args) {
		
		System.out.println("Enter a number to check Prime number");
		
		//taking input from user
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		//Logic part
		boolean notFound = true; 
		
		if(n==0 || n==1) {
			System.out.println("It is not a Prime number"); 
		}else {
			for(int i=2; i<n; i++) {
				if(n%i==0){
					notFound = false;
					break;
				}
			}
		}
		
		//output
		if(notFound){
			System.out.println("It is a Prime number");
		}else {
			System.out.println("It is not a Prime number");
		}
		
	}

}
