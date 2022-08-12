package Lab12aug;

import java.util.ArrayList;
import java.util.List;

public class Lab8Qn_2 {
	public static void main(String[] args) {	//main method
		//creating array list objects
		List<String> al1 = new ArrayList<>();
		List<String> al2 = new ArrayList<>();
		
		//adding elements to al1
		al1.add("Red");
		al1.add("Green");
		al1.add("Black");
		al1.add("White");
		al1.add("Pink");
		
		//adding elements to al2
		al2.add("Red");
		al2.add("Green");
		al2.add("Black");
		al2.add("Pink");
		
		//comparing all elements of al1 with al2
		System.out.println("comparing all elements of al1 with al2");
		for (String s : al1) {
			if(al2.contains(s)) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}
