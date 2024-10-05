package comparable_comparator;

import java.util.Comparator;

public class IdSorting implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmp_id()-o2.getEmp_id();
	}

	

}
