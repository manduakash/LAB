package com.lab.problem1;

public class Main {		//main class
	
	//main method
	public static void main(String[] args) {
		
		//creating customer class object and invoking methods
		
		Customer c1 = new Customer();
		c1.createAccount(12345, "Mamta", 500);	//invoking create method
		c1.addAmount(2000); 	//invoking method
		c1.getAmount(); 		//invoking method
		
		Customer c2 = new Customer();
		c2.createAccount(12345, "Akash", 500);	//invoking create method
		c2.addAmount(1000); 	//invoking method
		c2.getAmount(); 		//invoking method
	}
}
