package mapInterface_in_java;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<String , Boolean> hm = new HashMap<>();
		
		hm.put("Question1 ", true);
		hm.put("Question2", false);
		hm.put("Question3 ", true);
		hm.put("Question4 ", true);
		hm.put("Question4", false);
		
		
		for(Map.Entry<String, Boolean> ee: hm.entrySet()) {
			
			System.out.println(ee);
		}
		
		
		
		
		
		
		
		
	}

}
