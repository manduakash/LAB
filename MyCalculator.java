/* @author Akash Singh
 * Java program to do divisor sum
*/

package Lab;
import java.util.Scanner;

interface AdvancedArithmetic{
	int divisor_sum(int n);		// declaring the divisor_sum method
}
public class MyCalculator implements AdvancedArithmetic{		// implementing the interface AdvancedArithmetic 
	
	// logic part
	public int divisor_sum(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			if(n%6==0) {
			sum +=i;}
		}
		return sum;	
		}
	
	//main method
	public static void main(String[] args) {
		// creating objects
		MyCalculator obj = new MyCalculator();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input a number to do divisor sum");
		int n = scan.nextInt();		// taking output from user
		
		//output
		System.out.println("Divisor sum of "+n+" is "+obj.divisor_sum(n));
		scan.close();
	}
	
	}

