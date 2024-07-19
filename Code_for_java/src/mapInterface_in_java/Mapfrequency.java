package mapInterface_in_java;
import java.util.*;

public class Mapfrequency {

	public static void main(String[] args) {
		
		String s = "aaabbcchh";
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		
		char [] c = s.toCharArray();
	
		
		for(char ch : c) {
			
			
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}
			else {
				hm.put(ch,1 );
			}
				
			}
				
			
		for(Map.Entry<Character, Integer> ee:hm.entrySet()) {
			System.out.println(ee);
			
		}
		
		

	}

}
