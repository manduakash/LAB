//@author Akash Singh
//Lab 21 july Question no. 3
package Lab;

public class Lab21_julyQ3 {
	public static void main(String[] args) {	//main method
		
		// instantiating and initializing array
				String[] arr = {"a","b","c","d","e"}; 
				
				// logic
				System.out.println("Elements that are present in odd positions: ");
				for (int i = 0; i < arr.length; i=i+2) {	//loop for traversing odd position-wise not odd index-wise
					System.out.print(arr[i]+" ");		// SOP of each element
				}
	}
}
