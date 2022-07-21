//@author Akash Singh
//Lab 21 july Question no. 3:- Print elements of the array odd position-wise.
package Lab;

public class Lab21_julyQ3 {
	public static void main(String[] args) {	//main method
		
		// instantiating and initializing array
		String[] arr = {"a","b","c","d","e"}; 

		// loop for traversing odd position-wise
		System.out.println("Elements that are present in odd positions: ");
		for (int i = 0; i < arr.length; i=i+2) {				//logic
			System.out.print(arr[i]+" ");					// SOP of each element
		}
	}
}
