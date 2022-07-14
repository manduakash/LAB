/* @author Akash Singh
 * Java program to find Circle area and circumference
*/

package com.innovation.shapes;
import java.util.Scanner;

public class Circle {
	float radius;
	public float pi=3.5f;
	
	public Circle() {		// constructor 1
		radius=1.5f;
	}
	public Circle(float radius) {		// constructor 2
		this.radius=radius;
	}
	public Circle(float radius,float pi) {		// constructor 3
		this(radius);			// constructor chaining using constructor 2
		this.pi=3.5f;
	}
	
	public float calculateCircleArea(float radius) {
		return pi*radius*radius;
	}
	public float calculateCircumference(float radius) {
		return 2*pi*radius;
	}
	
	//main method
	public static void main(String[] args) {
		Circle obj = new Circle();
		Scanner scan = new Scanner(System.in);
		System.out.println("Input your radius");
		float a = scan.nextFloat();
		
		System.out.println("The area of circle is "+ obj.calculateCircleArea(a));
		System.out.println("The circumference of circle is "+ obj.calculateCircumference(a));
		scan.close();
		
	}
}
