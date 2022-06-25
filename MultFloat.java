/*
@Author Akash Singh
*/
//JAVA PROGRAM TO MULTIPLY TWO FLOATING-POINT NUMBERS

import javax.swing.*; //importing package for GUI dialog boxes

class MultFloat{
	//main method
	public static void main(String args[]){
		
		JFrame jFrame = new JFrame(); // using Jframe class for GUI dialogs
		
		//taking inputs from user
		String a = JOptionPane.showInputDialog(jFrame,"Type the 1st floating number for Multiplication");
		String b = JOptionPane.showInputDialog(jFrame,"Type the 2nd floating number for Multiplication");
		
		//changing data type of inputs
		float a_float = Float.parseFloat(a);
		float b_float = Float.parseFloat(b);
		
		//output
		JOptionPane.showMessageDialog(jFrame,"Multiplication of "+ a + " and "+ b +" = " + (a_float*b_float));
	}
}
