/* @author AKASH SINGH 
 * validating IP address using regex
 * */

package LabWeek6;

import java.util.regex.*;

class MyRegex{
	
	void checkIP(String ip) {	// static method for checking ip 
	
	//this is regex pattern for checking ip address
	String ip_pattern = "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." 		// this regex pattern will allow to accept 0 to 255 digits only
					  + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." 		// same as above
					  + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." 		// same as above
					  + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])";			// same as above
	
	Pattern p = Pattern.compile(ip_pattern);				// passing regex pattern into comile method of static pattern class 
	Matcher m = p.matcher(ip);								// matching ip agrguments to regex pattern
			
	if(m.matches() == true) {								// if pattern matches then it will return true 
		System.out.println(ip+" is a valid ip address...\n");
	}else {													// if pattern doesnt match then it will "print invalid ip"
		System.out.println(ip+" is an invalid ip address...\n");				
	}
	
	
  }
}

public class LabWeek6_Q4 {
	
	//main method
	public static void main(String[] args) {
		//instantiating objects
		MyRegex obj = new MyRegex();
		
		//invoking checkIP method 
		//Taking sample inputs according to question
		obj.checkIP("000.12.12.034");
		obj.checkIP("121.234.12.12");
		obj.checkIP("23.45.12.56");
		obj.checkIP("00.12.123.123123.123");
		obj.checkIP("122.23");
		obj.checkIP("Hello.IP");
		
	}

}
