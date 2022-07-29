/* @author AKASH SINGH 
 * checking lowercase and underscore pattern using regular expressions
 * */

package LabWeek6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MyRegex2{
	
	void lowerUnderscore(String input) {						// static method for checking ip 
	
	//this is regex pattern for checking ip address
	String pattern = "[a-z]+_[a-z]+";					 	//regex pattern for this problem
	
	Pattern p = Pattern.compile(pattern);				     		// passing regex pattern into comile method of static pattern class 
	Matcher m = p.matcher(input);						       // matching ip agrguments to regex pattern
			
	if(m.matches() == true) {						      // if pattern matches then it will return true 
		System.out.println("Found a match...\n");
	}else {									      // if pattern doesnt match then it will exicute else part
		System.out.println("Not match...\n");				
	}
	
	
  }
}

public class LabWeek6_Q3 {
		//main method
		public static void main(String[] args) {
			//instantiating objects
			MyRegex2 obj = new MyRegex2();
			
			//invoking lowerUnderscore method 
			obj.lowerUnderscore("java_excercise");			//sample input 1				
			obj.lowerUnderscore("Java_Excercise");			//sample input 2
			
		}
}
