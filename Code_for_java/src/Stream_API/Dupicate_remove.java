package Stream_API;
import java.util.*;
import java.util.stream.Collectors;

public  class Dupicate_remove {

	//method to remove duplicate element of List
	public static  List  remove_duplicate(List list) {


		
		List<String>list2 = (List<String>) list.stream().distinct().collect(Collectors.toList());
		return list2;

	}


	//main method
	public static void main(String[] args) {

		//creating list of string
		List<String> list = new ArrayList<>();

		list.add("Ram");
		list.add("Raja");
		list.add("Rani");
		list.add("Ram");//duplicate
		list.add("shyam");
		list.add("Ram");//duplicate
		list.add("shyam");//duplicate

		System.out.println(remove_duplicate(list)); //caling method




	}

	

}
