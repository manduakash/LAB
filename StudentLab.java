//@author Akash Singh
package com.assignment.java;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//using lombok
@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentLab{
	private Long studentId=0L, Maths=0L;
	private Character studentGrade='\u0000';
	private Double monthlyFees=0.0,Fees=0.0,English=0.0;
	private Boolean isScholarshipEligible=false;
	
	//method for calculating structute of fees
	public void calculateFeesStructure(long studentId, char grade, double monthlyFees, boolean isScholarshipEligible) {
		//business logic
		if((studentId!=0) && (studentGrade=='A') && (isScholarshipEligible==true)) {
			Fees=monthlyFees-(monthlyFees*0.10);
			this.studentId=studentId;
			this.studentGrade=grade;
			this.isScholarshipEligible=true;
			System.out.println("10% of fees is exempted, the calculated fees is "+Math.round(Fees));
		}
		else if((studentId!=0) && (studentGrade=='B') && (isScholarshipEligible==true)) {
			Fees=monthlyFees-(monthlyFees*0.08);
			this.studentId=studentId;
			this.studentGrade=grade;
			this.isScholarshipEligible=true;
			System.out.println("8% of fees is exempted, the calculated fees is "+Math.round(Fees));
		}
		else if((studentId!=0) && (studentGrade=='C') && (isScholarshipEligible==true)) {
			Fees=monthlyFees-(monthlyFees*0.06);
			this.studentId=studentId;
			this.studentGrade=grade;
			this.isScholarshipEligible=true;
			System.out.println("6% of fees is exempted, the calculated fees is "+Math.round(Fees));
		}
		else if((studentId!=0) && (studentGrade=='D') && (isScholarshipEligible==true)) {
			Fees=monthlyFees-(monthlyFees*0.04);
			this.studentId=studentId;
			this.studentGrade=grade;
			this.isScholarshipEligible=true;
			System.out.println("4% of fees is exempted, the calculated fees is "+Math.round(Fees));
		}else {
			System.out.println("Not Eligible for Exemption.");
		}
	}
	
	//method for compare marks
	public void compareMarks(double English, long Maths) {
		Integer English_marks = (int)English;
		Integer Maths_marks = (int)Maths;
		//comparison logic
		if(English_marks > Maths_marks) {
			System.out.println("English mark is higher than Maths.");
		}else if(Maths_marks > English_marks){
			System.out.println("Maths mark is higher than English.");
		}else if(Maths_marks == English_marks) {
			System.out.println("Both Are Equal.");
		}
		 
	}
	
	//method for validating fees
		public void validateFees(Double Fees) {
			//comparison logic
			if(Fees.isInfinite()) {
				System.out.println("Fees is infinite.");
			}else{
				System.out.println("Fees is not infinite.\nValue in byte is "+Fees.byteValue());
			}
			 
		}
		
		public static void main(String[] args) {	//main method
			//instantiating object 
			Student obj = new Student();
			
			//test cases of calculateFeesStructure
			obj.calculateFeesStructure(234,'C',600,true);		//test case-1
			obj.calculateFeesStructure(115,'B',909.50,true);	//test case-2
			obj.calculateFeesStructure(980,'G',1810,false);		//test case-3
			
			//test cases of compareMarks
			obj.compareMarks(85,65); 							//test case-1
			obj.compareMarks(56,98); 							//test case-2
			obj.compareMarks(84,84); 							//test case-3
		}
	
}
