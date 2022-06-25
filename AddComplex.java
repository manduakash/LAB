/*
@Author Akash Singh
*/

//Java Program to add two complex numbers

import javax.swing.*;


class AddComplex{
	public static void main(String args[]){
		
		JFrame jFrame = new JFrame(); //using jframe class for dialog box
		
		//taking input from user
		String real1 = JOptionPane.showInputDialog(jFrame,"Enter Real number of your 1st complex number!");
		String img1 = JOptionPane.showInputDialog(jFrame,"Enter Imaginary number of your 1st complex number!");
		String real2 = JOptionPane.showInputDialog(jFrame,"Enter Real number of your 1st complex number!");
		String img2 = JOptionPane.showInputDialog(jFrame,"Enter Imaginary number of your 1st complex number!");
		
		//changing data types
		int real1_Int = Integer.parseInt(real1);
		int img1_Int = Integer.parseInt(img1);
		int real2_Int = Integer.parseInt(real2);
		int img2_Int = Integer.parseInt(img2);
		
		//output
		JOptionPane.showMessageDialog(jFrame, "Addition of complex numbers = " + (real1_Int + real2_Int) + "+" + (img1_Int + img2_Int)+"i");
	}
}
