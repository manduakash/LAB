//@author Akash Singh
// Problem no. 1_1
package LabWeek3;

class Arithmetic {
	int sum=0;
	int add(int ...a) { // using var-args for taking input; reason: unknown number of inputs
		
		for(int i:a){ // Logic
		sum += i;}
		
		return sum;
	}
}

public class Lab3Qn1_1 {
	public static void main(String[] args) {	// main method
		
		Arithmetic a = new Arithmetic(); // creating instance of Arithmetic
		
		int result = a.add(2,5,6,5,8); // calling the add method 
		System.out.println("Sum of these numbers is: "+ result); // output

	}

}
