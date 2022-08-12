package Lab12aug;

import java.util.LinkedList;

public class Lab8Qn_4 {	//main class
	public static void main(String[] args) { //main method
		//creating linkedlist object
	LinkedList<Integer> ll = new LinkedList<>();
	//adding elements
	ll.add(43);
	ll.add(35);
	ll.add(86);
	ll.add(95);
	ll.add(23);
	ll.add(63);

	System.out.println("Traversing before replacing element");
	System.out.println(ll);
	
	ll.set(2, 100); 	//replacing element 100 with 86
	System.out.println("Traversing after replacing element");
	System.out.println(ll);
	
}
}
