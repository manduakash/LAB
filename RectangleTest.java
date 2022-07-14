/* @author Akash Singh
 * Java program to find rectange area
*/
package Lab;

import java.util.Scanner;

class Rectangle{
	private int lenght;
	private int breadth;
	
	Rectangle(){		//default constructor
		this.lenght=400;
		this.breadth=400;
	}
	public int getLenght() {	// getter for lenght
		return lenght;
	}
	public int getBreadth() {	// getter for breadth
		return breadth;
	}
	public void area(int lenght, int breadth) {		// method for area
		this.lenght=lenght;
		this.breadth=breadth;
		System.out.println("Area of this reactangle is "+ this.lenght*this.breadth);
	}
}

public class RectangleTest {
	//main method
	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		Scanner scan = new Scanner(System.in);
		
		//taking input from user
		System.out.println("Input lenght and breadth of your rectangle...");
		int lenght=scan.nextInt();
		int breadth=scan.nextInt();
		
		//output
		obj.area(lenght, breadth); 		// invoking the area method
		
		scan.close();
		
	}
}
