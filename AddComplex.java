/*
@Author Akash Singh
*/

//Java Program to add two complex numbers

class AddComplex{
	public static void main(String args[]){
		
		int real1 = 2; //1st real number
		int img1= 5; //1st imaginary number
		
		int real2 = 7; //2nd real number
		int img2 = 3; //2nd imaginary number
		
		//output
		System.out.println("Addition of two complex numbers");
		
		System.out.println("1st real number = " + real1);
		System.out.println("1st imaginary number = " + img1);
		System.out.println("2nd real number = " + real2);
		System.out.println("2nd imaginary number = " + img2);
		
		System.out.println("Addition of complex numbers = " + (real1+real2) + "+" + (img1+img2)+"i");
	}
}