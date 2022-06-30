//@Author Akash Singh
//Java program to check Leap year

import java.util.*; //using for scanner class

public class IsLeapYear {

	public static void main(String[] args) {
		
		System.out.println("Enter a number to check Leap year");
		
		//taking input from user
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		//Logic part

		if((n%4==0) || (n%100==0)) {
			System.out.println("It is a Leap year");//output
		}else {
			System.out.println("It is not a Leap year");//output
		}
	}

}
