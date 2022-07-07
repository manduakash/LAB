//@author Akash Singh
// Problem no. 2
package LabWeek3;

class Teacher { // super class
	String college;
	String designation;
	public void work() {
		System.out.println("Working in " +college+ " college as " +designation);
	}
}
	class ITTeacher extends Teacher{ // subclass of Teacher class
		//IT teacher
	}
	
	class MathTeacher extends Teacher{ // subclass of Teacher class
		//Math teacher
	}
	
	class MusicTeacher extends Teacher{ // subclass of Teacher class
		// Music Teacher
	}
	
	class PhysicsTeacher extends Teacher{ // subclass of Teacher class
		// Physics teacher
	}
	


//creating class for main method 
public class Lab3Qn2 {
  public static void main(String[] args) { //main method
  	
  	//creating an instance child class for giving example
	  MathTeacher math = new MathTeacher();
	  math.college = "a college";
	  math.designation = "Math teacher";
	  
	//calling method of parent class of it
	  math.work(); //output
	  
  }
}
