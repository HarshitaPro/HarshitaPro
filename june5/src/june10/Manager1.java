package june10;

public class Manager1 extends Employee1 {
	String Department;
	
	Manager1(int salary,String name,String department){
		this.salary=salary;
		this.name=name;
		this.Department=department;
	}
			
			void display() {
		System.out.println("employee salary="+salary);
		System.out.println("employee name="+name);
		System.out.println("employee department="+Department);
	}

}
