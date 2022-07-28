/* @author AKASH SINGH 
 * Problem statement 2:
 * */
package LabWeek6;

public class LabWeek6_Q2 {
	
	//main method
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This is StringBuffer ");					// instantiating stringBuffer object
		
		System.out.println(sb.append("This is sample program"));						// adding string to existing string
		
		System.out.println(sb.insert(21, "Object"));									// inseting string at 21th position
		
		System.out.println(sb.reverse());												// reversing string 
		
		System.out.println(sb.replace(14, 20, "Builder"));								// replacing buffer with builder
	}
}
