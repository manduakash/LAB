package LabWeek3;
//@Author Akash Singh
//Problem 3: Answer- it is multi level inheritance and here an example of it.

class A { // Parent class
	
	void run() {
	System.out.println("This is A");
	}
}
	class B extends A{ // Child class of A class
		
		void run() {
			System.out.println("This is B");
		}
}
	
	class C extends B{ // Child class of B class
		
		void run() {
			System.out.println("This is C");
		}
}

	public class Lab3Qn3 {
		//main method
		public static void main(String[] args) {
		
			//creating objects of super and sub classes
			A a = new A(); 
			B b = new B();
			C c = new C();
			
			// using run method for output
			a.run(); 
			b.run(); 
			c.run(); 
			
	}

}
