package LabOct13_problem1;

public class Logic {//class for logic
	
	//Logic method
	public void isMultipleOf3or5(int n) {	//taking range value as parameter
		
		for (int i = 1; i <= n; i++) {	//loop start
			
			//conditions
			if( (i%3 == 0) && (i%5 == 0) ) {		//it will beexecuted, if no. devided by 3 & 5 both
				System.out.println("Good Morning");
			}
			else if( (i%3 == 0) && (i%5 != 0) ) {	//it will be executed, if no. devided by 3 only
				System.out.println("Good");
			}
			else if( (i%3 != 0) && (i%5 == 0) ) {	//it will be executed, if no. devided by 5 only
				System.out.println("Morning");
			}
			else									//it will be executed, if no. not devided by 3 and 5 both
				System.out.println(i);
		}//loop end
		
	}//method end
}//class end
