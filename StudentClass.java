//@author Akash Singh
//Lab 21 july Question no. 4
package Lab;


public class Lab27_Q4_StudentClass{		// main class
	//declaring instance varibles
	int studentNo ;
	String Name, Mail, Address;
	double fees;
	static double increasedFees;						// static member for increaseFees method
	
	
	//creating constructor for asssing the details to student
	StudentClass(int sn, String name, String mail, String address){		//passing values through overloded constructor
		this.studentNo=sn;
		this.Name=name;
		this.Mail=mail;
		this.Address=address;
	}
	
	//method for initializing fees to student 
	void fees(double f) {	
		fees=f;								// assigning passing value
		
	}
	
	//method for printing output
	void display() {							//for concation and SOP the output				
		this.fees=this.fees+increasedFees;				//updating fees before printing
		System.out.println("Id-" +this.studentNo+ " 	Name-" +this.Name+ " 	Mail-" +this.Mail+ " 	Address-" +this.Address + " 	Fees-" +fees);
	}
	
	//increasing fees method
	static void increaseFees(int n, double f) {
		if(f<2000) {							// condition 
			f=10*f/100;						// logic for increasing fees
			increasedFees=f;					//assigning the value to static instance member 		
		}
	}
	

	// main method
	public static void main(String[] args) {
		
		//instantiatind Student type of array and declaring size
		StudentClass[] student = new StudentClass[5];
		
		//Instantiating objects of StudentClass and initializing into array
		student[0]= new StudentClass(101,"Akash","akash@gmail.com","Somewhere, Bihar");
		student[1]= new StudentClass(102,"Sayan","Sayan@gmail.com","Somewhere, West Bengal");
		student[2]= new StudentClass(103,"Sagnik","Sagnik@gmail.com","Somewhere, West Bengal");
		student[3]= new StudentClass(104,"Ravi","Ravi@gmail.com","Somewhere, Hyderabad");
		student[4]= new StudentClass(105,"Owashim","Owashim@gmail.com","Somewhere, West Bengal");
		
		//adding fees values
		student[0].fees(1064);
		student[1].fees(2056);
		student[2].fees(957);
		student[3].fees(1999);
		student[4].fees(2001);
		
		//increasing fees whose fees is less than 2000
		increaseFees(100,1064);
		increaseFees(102,957);
		increaseFees(103,1999);
		
		
		//traversing the array of student objects
		System.out.println("_____________________________Details of Students_______________________________\n");
		for(StudentClass i:student) {
			i.display();					//traversing with invocation of display
		}
		
		

	}

}
