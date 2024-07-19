package mapInterface_in_java;
import java.util.*;

public class MapFreQuencyInteger {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,4,5,6,3,2,5,2,1,4,6,3,1,1};
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int a :arr) {
			
			if(map.containsKey(a)) {
				
				map.put(a, map.get(a)+1);
			}
			
			else {
				map.put(a, 1);
			}
		}
		
		for(Map.Entry<Integer, Integer>ee : map.entrySet()) {
			System.out.println(ee);
		}
		
	}

}
