/*
@Author Akash Singh
*/
//JAVA PROGRAM TO MULTIPLY TWO NUMBERS

import javax.swing.*; //importing package for GUI dialog boxes

class MultTwoNums{
	//main method
	public static void main(String args[]){
		
		JFrame jFrame = new JFrame(); // using Jframe class for GUI dialogs
		
		//taking inputs from user
		String a = JOptionPane.showInputDialog(jFrame,"Type the 1st number for Multiplication");
		String b = JOptionPane.showInputDialog(jFrame,"Type the 2nd number for Multiplication");
		
		//changing data type of inputs
		int a_Int = Integer.parseInt(a);
		int b_Int = Integer.parseInt(b);
		
		//output
		JOptionPane.showMessageDialog(jFrame,"Multiplication of "+ a + " and "+ b +" = " + (a_Int*b_Int));
	}
}
