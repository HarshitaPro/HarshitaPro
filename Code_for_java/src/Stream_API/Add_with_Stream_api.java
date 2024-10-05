package Stream_API;
import java.util.*;
import java.util.stream.Collectors;

public class Add_with_Stream_api {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(3); //odd
		list1.add(4);
		list1.add(5);//odd
		list1.add(17);//odd
		list1.add(15);//odd
		//stream api
		
		List<Integer>list2 = list1.stream().filter(p->p%2!=0).map(p->p+5).collect(Collectors.toList());
		 System.out.println(list2);
		
		
		
		
		
		
		
	}

}
