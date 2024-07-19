package mapInterface_in_java;
import java.util.*;

public class Country {
	
	String name;
	String capital;
	
	HashMap<String ,String> country = new HashMap<>();
	
	void add(String key, String value) {
		country.put(key, value);
	}
	String get(String c) {
		String capital=" ";
		for(Map.Entry<String, String>map:country.entrySet()) {
			if(map.getKey().equals(c)) {
				
				capital= map.getValue();
			}
			
			
			
		}
		return capital;
		
		
		
	}
	
	public static void main(String[] args) {
		
		Country a = new Country();
		a.add("india", "delhi");
		System.out.println(a.get("india"));
		a.add("bangladesh"," dhaka");
		System.out.println(a.get("bangladesh"));
		a.add("india", "mexico");
		System.out.println(a.get("india"));
		
	}
	
	
}
