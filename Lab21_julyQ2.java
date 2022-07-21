//@author Akash Singh
//Lab 21 july Question no. 2
package Lab;

public class Lab21_julyQ2 {

	public static void main(String[] args) {
		
		// instantiating and initializing array
				int[] arr = {5,2,7,7,5}; 
				
				// logic
				int duplicate = 0;				// it is a counter variable
				
				lebelOuter:
				for(int i = 0; i < arr.length; i++) {	//loop for searching
					for(int j=i+1 ;j < arr.length; j++) {
						if(arr[i] == arr[j]) {		// condition checking
							duplicate=1;				
							break lebelOuter;			// label break will terminate outer loop
						}
						else {
							duplicate=0;					// if not found the value assigned 0
						}
					}
				}
				
				System.out.println("Is there any redundant element in this array: ");
				// checking counter variable
				if(duplicate==1) {		
					System.out.println("Duplicate found");		// if found
				}else {
					System.out.println("Duplicate not found");	// if not found
				}
	}

}
