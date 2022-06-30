//@Author Akash Singh
//Java program to check armstrong Number

import java.util.*; //using for scanner class

public class ArmstrongNum {

	public static void main(String[] args) {
		
		System.out.println("Enter a number to check Armstrong number");
		
		//taking input from user
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();
		
		int r, sum=0, temp;
		
		temp = input;
		
		//logig of armstrong
		while ( input>0 ) {
			r = input%10; //taking the last digit of number
			sum += r*r*r; //storing in sum after finding the cube(power 3) of it
			input = input/10; //removing last digit
		}
		
		//validiating armstrong
		if (temp == sum) {
			System.out.println(temp+ " is an armstrong number");
		}else {
			System.out.println(temp+ " is not an armstrong number");
		}
	
	}

}
