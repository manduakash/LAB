package Lab12aug;

import java.util.ArrayList;
import java.util.List;

public class Lab8Qn_1 {
	public static void main(String[] args) {	//main method
		//creating array list object
		List<String> al = new ArrayList<>();
		
		//adding elements
		al.add("Red");
		al.add("Green");
		al.add("Orange");
		al.add("White");
		al.add("Black");
		
		//traversing first three elements
		System.out.println("traversing first three elements");
		for(int i=0; i<3; i++) {
			System.out.println(al.get(i));		
		}
	}
}
