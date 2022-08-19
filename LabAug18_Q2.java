/* @author Akash Singh
 * */
package Lab;
import java.util.HashSet;
public class LabAug18_Q2 { //main class
	
	HashSet<String> Country = new HashSet<>();
	
	// Question #1
	public void storeCountryNames(String CountryName) {
		Country.add(CountryName);	//logic to add value into HashSet
	}
	
	// Question #2
	public String retrieveCountry(String CountryName) {
		
		for (String s : Country) {
			Country.contains(CountryName);	//if present then it will return the parameter
			return CountryName;
		}
		return null;						//otherwise it will retrun null
	}
	
	
	public static void main(String[] args){ //main method
		LabAug18_Q2 obj = new LabAug18_Q2(); //creating object
		
		//adding by invoking storeCountryNames method
		obj.storeCountryNames("India");
		obj.storeCountryNames("Pakistan");
		obj.storeCountryNames("Bangladesh");
		obj.storeCountryNames("Nepal");
		obj.storeCountryNames("Sri Lanka");
		
		if(obj.retrieveCountry("India")=="India") {	//logic for checking element present or not
			System.out.println("present");
		}else {
			System.out.println("not present");
		}
	}
}
