package com.lab.problem4;

public class ArrayOperation {	//logic class
	private int[] arr;
//	private int targetStartIndex;
//	private int targetEndIndex;
	
	// method for taking array inputs
	public void addArray( int[] arr) {
		this.arr = arr;
	}
	
	// method for adding 
	public int addingArrayItems(int firstIndex, int lastIndex) {
		int sum=0;
		for (int i = firstIndex; i < lastIndex; i++) {
			sum += this.arr[i];
		}
		
		return sum;
	}
	
}
