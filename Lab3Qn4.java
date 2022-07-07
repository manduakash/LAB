//@author Akash Singh
// Problem no. 4

package LabWeek3;


class Bank{ // parent class
    float getRateOfInterest(){
        return 0;
    }
}
class SBI extends Bank{ // child class of Bank class
    @Override
	float getRateOfInterest(){
        return 8.00f;
    }
}
class ICICI extends Bank{ // child class of Bank class
    @Override
	float getRateOfInterest(){
        return 7.00f;
    }
}
class Axis extends Bank{ // child class of Bank class
	@Override
	float getRateOfInterest(){
        return 9.00f;
    }
}

//creating class for main method 
public class Lab3Qn4 {
    public static void main(String[] args) { //main method
    	
    	//creating instances 
    	SBI sbi=new SBI();  
    	ICICI icici=new ICICI();  
    	Axis axis=new Axis();  
    	
    	//output
    	System.out.println("SBI Rate of Interest: "+sbi.getRateOfInterest());  
    	System.out.println("ICICI Rate of Interest: "+icici.getRateOfInterest());  
    	System.out.println("AXIS Rate of Interest: "+axis.getRateOfInterest());  
    }
}
