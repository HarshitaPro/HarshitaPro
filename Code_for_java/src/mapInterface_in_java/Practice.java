package mapInterface_in_java;
import java.util.*;

public class Practice {

	public static void main(String[] args) {
		
		int[] arr  = {1,2,3,4,1,2,3,4,5}; 
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i : arr) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
			else {
				map.put(i, 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> m: map.entrySet()) {
			
			System.out.println(m);
		}
	}
}
