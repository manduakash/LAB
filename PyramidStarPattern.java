//@Author Akash Singh
//Java program to print pyramid like star's pattern

import java.util.*; //using for scanner class

public class PyramidStarPattern {

	public static void main(String[] args) {
		
		System.out.println("Enter the height of pyramid");
		
		//taking input from user
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); //n is the number of rows
		scan.close();
		
		//Logic part

		for(int i=0; i<n; i++) {
			for(int j=n-i; j>1; j--) {
				System.out.print(" "); //print whitespaces before printing stars
			}
			for(int j=0; j<=i; j++) {
				System.out.print("* "); //print the star
			}
			//changing row
			System.out.println();
		}
		
	}

}
