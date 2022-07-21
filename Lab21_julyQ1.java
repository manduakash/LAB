//@author Akash Singh
//Lab 21 july Question no. 1
package Lab;

public class Lab21_julyQ1 {		//class

	public static void main(String[] args) {	//main method
		// instantiating and initializing array
		int[] arr = {1789,2035,1899,1456,2013};
		
		int findValue = 2013; // the value that has to be searched 
		
		// logic
		int found = 0;		// counter variable
		for (int i = 0; i < arr.length; i++) {	//loop for searching
			if(arr[i] == findValue) {		// condition checking
				found=1;					// if found the value assinged 1
			}
			else {
				found=0;					// if not found the value assigned 0
			}
		}
		
		System.out.println("The value "+findValue+" is :");
		
		// checking counter variable
		if(found==1) {
			System.out.println("Found");
		}else {
			System.out.println("Not found");
		}
			
		
	}

}
