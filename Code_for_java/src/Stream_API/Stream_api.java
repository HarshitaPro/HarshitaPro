package Stream_API;
import java.util.*;
import java.util.stream.Stream;

public class Stream_api {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(12);
		ar.add(13);
		ar.add(1);
		ar.add(2);
		
		Stream <Integer>s = ar.stream();
		
		//s.forEach(x->System.out.println(x));
		
		s.map(x->x*x);
		
	
	

	}

}
