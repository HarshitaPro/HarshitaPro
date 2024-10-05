package Stream_API;
import java.util.*;
import java.util.Collections;
import java.util.stream.*;

public class Operation_on_Stream {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> array = new ArrayList<>();
		array.add(12);
		array.add(10);
		array.add(9);
		array.add(13);
		array.add(10);
		
		Stream<Integer> stream =  array.stream().map(x->x*x).filter(x->x%2==0).distinct();
		
		List<Integer>list = stream.collect(Collectors.toList());
		System.out.println(list);
	
		
		
		
		
	}

}
