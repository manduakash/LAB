//@Author Akash Singh
//Java Program to Add Two Numbers

import javax.swing.*; // importing packages for GUI dialog boxes

class AddTwoNums{
	//main method
	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame(); //using jFrame class for GUI dialog boxes
	
		String a = JOptionPane.showInputDialog(jFrame,"Type 1st number for Addition"); //taking input from user
		String b = JOptionPane.showInputDialog(jFrame, "Type 2nd number for Addition"); //taking input from user
		
		//changing data type
		int a_Int = Integer.parseInt(a);
		int b_Int = Integer.parseInt(b);
		
		//output
		JOptionPane.showMessageDialog(jFrame,"Additon of " +a+ " and " +b+ " = " + (a_Int+b_Int));
  }
}
