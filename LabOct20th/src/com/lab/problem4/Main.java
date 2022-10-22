package com.lab.problem4;

import java.util.Scanner;

public class Main { // main class

	public static void main(String[] args) { // main mehtod

		// creating array logic class
		ArrayOperation obj = new ArrayOperation();

		// scanner class for taking user inputs
		Scanner scan = new Scanner(System.in);

		// taking inputs for array size
		System.out.println("Enter the size of array");
		int arrLen = scan.nextInt();

		// taking inputs for array items
		System.out.println("Enter " + arrLen + " numbers");
		int[] tempArray = new int[arrLen]; // temprory array

		for (int i = 0; i < arrLen; i++) { // loop start
			tempArray[i] = scan.nextInt(); // taking array items adding into the array
		} // loop end
		obj.addArray(tempArray); // invoking add array method

		// taking first input of adding array
		System.out.println("Enter the starting index to add numbers");
		int targetStartIndex = scan.nextInt();
		// taking last input of adding array
		System.out.println("Enter the ending index to add numbers");
		int targetEndIndex = scan.nextInt();

		// invoking adding method
		int sumOfNums = obj.addingArrayItems(targetStartIndex, targetEndIndex);
		System.out.println("Sum of numbers : " + sumOfNums); // displaying output

		scan.close(); // closing scanner class
	}
}
