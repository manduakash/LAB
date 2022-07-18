/* @author Akash Singh
 * Java program to find Circle area and circumference
*/

package com.innovation.shapes;
import java.util.Scanner;

public class Circle {	//class
	public float radius;
	public float pi=3.5f;
	
	public Circle() {		// constructor 1 ; setting default value
		this.radius=1.5f;
	}
	public Circle(float radius) {		// constructor 2
		this.radius=radius;
	}
	public Circle(float radius,float pi) {		// constructor 3
		this(radius);			// constructor chaining using constructor 2
		this.pi=3.5f;
	}
	
	public float calculateCircleArea(float radius) {	//method for calculating area
		return pi*radius*radius;
	}
	public float calculateCircumference(float radius) {		//method for calculating circumference
		return 2*pi*radius;
	}
	
	//main method
	public static void main(String[] args) {
		
		// instantiating objects
		Circle obj = new Circle();
		Scanner scan = new Scanner(System.in);		// for taking input
		
		// taking user input
		System.out.println("Input your radius");
		float a = scan.nextFloat();
		
		// invoking the methods printing as ouput
		System.out.println("The area of circle is "+ obj.calculateCircleArea(a));		// for area 
		System.out.println("The circumference of circle is "+ obj.calculateCircumference(a));	// for circumference
		
		scan.close();	// closing input strean
		
	}
}
