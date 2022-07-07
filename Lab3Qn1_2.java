//@author Akash Singh
// Problem no. 1_2
package LabWeek3;

class Adder extends Arithmetic { // child class of Arithmetic
	// derived class of Arithmetic class
}

public class Lab3Qn1_2{
public static void main(String[] args) {	// main method
		
		Adder a2 = new Adder(); // creating instance of Adder
		
		int result = a2.add(5,9); // calling the add method from super class Arithmetic
		System.out.println("Sum of these numbers is: "+ result); // output

	}

}
