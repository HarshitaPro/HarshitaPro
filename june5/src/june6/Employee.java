package june6;

 public class Employee {
	
	 int emp_id;
	String emp_Name;
	String emp_department;
	String shift;
	 
	public String display() {
		return shift;
		
	}
	//default constructor
	Employee(){
		emp_id = 12;
		emp_Name ="sachin";
		emp_department ="sales department";
		shift = "day shift";
	}
		
	//paramterized constructor
	public Employee(int emp_id, String emp_Name, String emp_department, String shift) 
	{
		
		this.emp_id = emp_id;
		this.emp_Name = emp_Name;
		this.emp_department = emp_department;
		this.shift = shift;
	}
	
	

}
