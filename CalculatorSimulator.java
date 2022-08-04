/*@Author AKASH SINGH
*	Problem statement 1:
*/
package LabWeek7;

public class CalculatorSimulator {	// main class
	
	public static void main(String[] args){		//main method
		
		//Instantiating object of TaxCalculator
		TaxCalculator obj = new TaxCalculator();
		
		//Test case: 1
		System.out.println("\nTest case-1:");
		System.out.println("Tax amount is " + obj.calculateTax("Ron", false, 34000));
		
		//Test case: 2
		System.out.println("\nTest case-2:");
		System.out.println("Tax amount is " + obj.calculateTax("Tim", true, 1000));
		
		//Test case: 3
		System.out.println("\nTest case-3:");
		System.out.println("Tax amount is " + obj.calculateTax("Jack", true, 55000));
		
		//Test case: 4
		System.out.println("\nTest case-4:");
		System.out.println("Tax amount is " + obj.calculateTax(null, true, 30000));					
		
	}
	
}
class TaxCalculator{
	
	public double calculateTax(String empName, boolean isIndian, double empSal){	                              //tax calculating method
		
		// Logic for calculating tax
		
		double taxAmount=0;
		try {
		if(isIndian!=true) {
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");		  //custom exception
		}
		
		if(empName==null) {
			throw new EmployeeNameInValidException("The employee name cant be empty");								              //custom exception
		}
		
		if(empSal>100000 && isIndian==true) {
			return taxAmount=empSal*8/100;
		}
		else if((empSal>50000 && empSal<100000) && isIndian==true) {
			return taxAmount=empSal*6/100;
		}
		else if((empSal>30000 && empSal<50000) && isIndian==true) {
			return taxAmount=empSal*5/100;
		}
		else if((empSal>10000 && empSal<30000) && isIndian==true) {
			return taxAmount=empSal*4/100;
		}
		
		else {
			throw new TaxNotEligibleException("The employee does not need to pay tax");								//custom exception
		}}
		catch(Exception e) {	// hadeling exceptions
			System.out.println(e);
		}
		return taxAmount;
	}
}

//creating custom exception classes----------------------

class CountryNotValidException extends Exception {

	public CountryNotValidException(String string) {            //overloading constructor of this object
		super(string);                                            //passing and invoking parameterized constructor of Exception class
	}

}

class EmployeeNameInValidException extends Exception {

	public EmployeeNameInValidException(String string) {        //overloading constructor of this object
		super(string);                                            //passing and invoking parameterized constructor of Exception class
	}

}

class TaxNotEligibleException extends Exception {

	public TaxNotEligibleException(String string) {              //overloading constructor of this object
		super(string);                                            //passing and invoking parameterized constructor of Exception class
	}

}


