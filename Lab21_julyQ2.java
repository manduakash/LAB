//@author Akash Singh
//Lab 21 july Question no. 2:- Find the total number of duplicates in array
package Lab;
import java.util.Scanner;

public class Lab21_julyQ2 {		//class
	public static void main(String[] args) {	//main method
		
		Scanner scan = new Scanner(System.in);					//instantiating scanner object 
		
		System.out.println("Enter the size of array: ");
		int n = scan.nextInt();							//for array size
		
		// instantiating and initializing array
		int[] arr = new int[n]; 
		
		
		System.out.println("Enter elements of array: ");
		for(int i=0; i<n; i++) {
			arr[i]=scan.nextInt();						//taking array elements from user
			}
			
			
		// logic
		int duplicate = 0;							// counter variable

		for(int i = 0; i < arr.length; i++) {					//loop for one element to compare

			for(int j=i+1; j < arr.length; j++) {				//loop for checking one by one to all array items

				if(arr[i] == arr[j]) {					//condition checking
					duplicate++;					//incrementing counter varible
					break;
				}
			}
		}


		// checking counter variable
		if(duplicate>=1) {							// if found
			System.out.println("\nTotal "+duplicate+" Duplicates found");	// SOP
		}else {
			System.out.println("Duplicate not found");			// if not found
		}

		scan.close();								//closing input stream
	}

}
