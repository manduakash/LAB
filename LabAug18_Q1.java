/* @author Akash Singh
 * */
package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LabAug18_Q1 {
	List<Integer> A1 = new ArrayList<>();	//creating A1 arrayList to store even numbers
	List<Integer> A2 = new ArrayList<>();	//creating A2 arrayList to store 2*even numbers
	
	//Question #1:
	public void storeEvenNumbers(int n){
		//logic
		for(int i=2; i<=n; i=i+2) {
			A1.add(i);
		}
		System.out.println("traversing A1 array list: ");
		A1.forEach(System.out::println); 	//internal iteration
	}
	
	// Question #2:	
	public void printEvenNumbers(){
		//logic
		A2=A1.stream().map(i->i*2).collect(Collectors.toList());	//I'm using stream,here map method is modifing and collect is converting my stream to list
		
		System.out.println("traversing A2 array list: ");
		A2.forEach(System.out::println); 							//internal iteration
	}
	
	// Question #3:	
	public int retriveEvenNumbers(int n){
		//logic
		for (Integer i : A1) {
			A1.contains(n);		
			return 1;
		}
		return 0;
	}
	public static void main(String[] args) { 						//main method
		LabAug18_Q1 obj = new LabAug18_Q1(); 						//creating object 
		obj.storeEvenNumbers(10);									//invoking method
		obj.printEvenNumbers();										//invoking method
		
		if(obj.retriveEvenNumbers(4)==1) {							//invoking method and passing 4 as arument to search in A1
			System.out.println("4 is present");
		}else {
			System.out.println("element is not present");
		}
	}
}
