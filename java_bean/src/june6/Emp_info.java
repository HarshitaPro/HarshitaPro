package june6;

public class Emp_info {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee(1,"harshita","IT department","day shift");
		Employee e3 = new Employee(2,"Annu","sales department","night shift");
		Employee e4 = new Employee(3,"kashi","marketing department","day shift");
		Employee e5 = new Employee(4,"aurna", "sales department","day shift");
		
		//calling methods and variables
		//calling e1
		System.out.println("employee id: "+e1.emp_id);
		System.out.println("employee name:"+e1.emp_Name);
		System.out.println("employee department:"+ e1.emp_department);
		System.out.println("employee shift:"+ e1.display());
		
		System.out.println();
		//calling e2
		System.out.println("employee id: "+e2.emp_id);
		System.out.println("employee name:"+e2.emp_Name);
		System.out.println("employee department:"+ e2.emp_department);
		System.out.println("employee shift:"+ e2.display());
		System.out.println();
		//calling e3
		System.out.println("employee id: "+e3.emp_id);
		System.out.println("employee name:"+e3.emp_Name);
		System.out.println("employee department:"+ e3.emp_department);
		System.out.println("employee shift:"+ e3.display());
		System.out.println();
		//calling e4
		System.out.println("employee id: "+e4.emp_id);
		System.out.println("employee name:"+e4.emp_Name);
		System.out.println("employee department:"+ e4.emp_department);
		System.out.println("employee shift:"+ e4.display());
		System.out.println();
		//calling e5
		System.out.println("employee id: "+e5.emp_id);
		System.out.println("employee name:"+e5.emp_Name);
		System.out.println("employee department:"+ e5.emp_department);
		System.out.println("employee shift:"+ e5.display());
	}
	

}
