package Basic_Inheritance;

public class Manager extends Employee{
	String department;
	public Manager(String name,String department,int salary) {
		super(salary ,name);
	
		this.department=department;
		
		
		
		
	}
	 void display() {
		 System.out.println(department);
		 System.out.println(salary);
		 System.out.println(Name);
	 }
	

	

}
