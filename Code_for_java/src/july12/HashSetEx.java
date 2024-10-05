package july12;
import java.util.*;


public class HashSetEx {
	
public static void main(String[] args) {
	
	HashSet<Integer> hs = new HashSet<>();// not maintain the insertion order
	
	hs.add(1);
	hs.add(1);
	hs.add(2);
	hs.add(0);
	hs.add(6);
	hs.remove(8);
	System.out.println(hs);
	
	for(int i :hs) {
		System.out.println(i);
		
	}
	System.out.println();
	//linked set - maintain the insertion order
	
	LinkedHashSet <String>s = new LinkedHashSet<>();
	s.add(null);
	s.add(null);
	s.add("harshita");
	s.add("simran");
	System.out.println(s);
	for(String i : s) {
		System.out.println(i);
	}
	
	//treeset===> do not have null values and maintain the sorting set
	System.out.println();
	
	TreeSet<String > ts = new TreeSet<>();

	ts.add("k");
	ts.add("harshita");
	ts.add("harshita");
	ts.add("a");
	int [] arr = {1};
	
	System.out.println(ts);

	
	
	
	
}
	

}
