/* @author Akash Singh
 * */
package Lab;

import java.util.HashMap;
import java.util.Map;

public class LabAug18_Q3 { //main class
	
	//creating instance Hashmap objects
	HashMap<String,String> CountryMap = new HashMap<>();
	HashMap<String,String> M2 = new HashMap<>();
	
	// Question #1
	public void storeCountryCapital(String CountryName, String capital) {
		CountryMap.put(CountryName,capital);	//logic to adding values into HashMap
	}
	
	// Question #2
	public void retrieveCapital(String CountryName) {
		for (Map.Entry<String,String> m : CountryMap.entrySet()) {
			System.out.println(m.getValue());	//logic 
		}
	}
	
	// Question #3
	public void retrieveCountry(String capitalName) {
		for (Map.Entry<String,String> m : CountryMap.entrySet()) {
			System.out.println(m.getKey());	//logic
		}
	}
	

	// Question #4
	public void createNewMap() {
		
		for (Map.Entry<String,String> m : CountryMap.entrySet()) {
			M2.put((String)m.getValue(), (String)m.getKey());	/*logic to create new map; 
															    here Im storing all keys as values and 
															    all valuse as keys into M2 map
															    Explicitly casting is needed coz M2 accepts only string keys and values*/
		}
	}
	
	public static void main(String[] args){ //main method
		LabAug18_Q3 obj = new LabAug18_Q3(); //creating object
		
		//adding by invoking storeCountryNames method
		obj.storeCountryCapital("India","Delhi");
		obj.storeCountryCapital("Japan","Tokyo");
		
		System.out.println(obj.CountryMap);
		
		//storing all elements into M2
		obj.createNewMap();
		System.out.println(obj.M2);
	
		
		
	}
}
