package LabOct13Problem_2;

public class Logic {//logic class
	
	//method for lowercasing the user inputs
	public String stringsToLower(String s1, String s2) {
		return s1.toLowerCase()+" "+s2.toLowerCase();		//converting into lowercase
	}
	
	//method for sum of length of both inputs
	public int lengthOfStrings(String s1, String s2) {
		return s1.length()+s2.length();						//concatinating of both string's length
	}
	
	//method for lexicographically comparasion
	public boolean comparasionOfStrings(String s1, String s2) {
		int n = s2.compareTo(s1);							//camparing lexicographically
		return ( (n>0) ? true : false );					//returning boolean
	}
	
	//method for capitalize first letter of both strings
	public String capitalizeOfStrings(String s1, String s2) {
		return s1.substring(0,1).toUpperCase()+s1.substring(1)+" "+		//capitalizing string 1
			   s2.substring(0,1).toUpperCase()+s2.substring(1);			//capitalizing string 2
	}
}
