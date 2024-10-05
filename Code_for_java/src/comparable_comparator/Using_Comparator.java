package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Using_Comparator {
	public static void main(String[] args) {
		ArrayList<Employee> array = new ArrayList<>();
		
		
		Employee[] emp = { new Employee(11, "harshita", 743682491),
				
				             new Employee(45, "harsh", 743689491),
				             new Employee(8, "harshit", 743682491),
				             new Employee(98, "Divyanka", 743682491),
				             new Employee(13, "Manu", 743682491)
				          
		};
		
		for(Employee i: emp) {
			array.add(i);
		}
		
		Collections.sort(array,new IdSorting ()); //sorting using logic written in another class instead of employee class
		System.out.println(array);
		

}
}
