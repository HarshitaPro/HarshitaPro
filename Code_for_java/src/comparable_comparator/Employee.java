package comparable_comparator;

import java.util.Comparator;

public class Employee implements Comparable <Employee>{
	
	
	private int emp_id;
	private String name;
	private int mobile_no;
	
	
	//parameterized constructor
	public Employee(int emp_id, String name, int mobile_no) {
		
		this.emp_id = emp_id;
		this.name = name;
		this.mobile_no = mobile_no;
	}

      //getters used to get the data of private fields

	

	public int getEmp_id() {
		return emp_id;
	}



	public String getName() {
		return name;
	}



	public int getMobile_no() {
		return mobile_no;
	}

	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		return this.emp_id  -e.emp_id ;
	}
	


	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", mobile_no=" + mobile_no + "]";
	}

	



	

}
