package mapInterface_in_java;
import java.util.*;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		LinkedHashMap<String ,String> linkedmap = new LinkedHashMap<>();
		linkedmap.put("india", "delhi");
		linkedmap.put("india", "delhi");
		linkedmap.put("bangladesh", "dhaka");
		linkedmap.put(null, null);
		for(Map.Entry<String , String> m: linkedmap.entrySet()) {
			
			System.out.println(m);
		}
		
		
		
		

	}

}
