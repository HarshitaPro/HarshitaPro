package mapInterface_in_java;
import java.util.*;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer, Integer> treemap = new TreeMap<>();
		treemap.put(1, 12);
		treemap.put(2, null);
		treemap.put(4, null);
		treemap.put(3, null);
		
		
		
		for(Map.Entry<Integer, Integer>map : treemap.entrySet()) {
			System.out.println(map);
		}
		

	}

}
