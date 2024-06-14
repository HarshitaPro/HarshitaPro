package june6;

public class Employee_info {

	public static void main(String[] args) {
		Employee2 e1 = new Employee2();
		Employee2 e2= new Employee2();
		Employee2 e3= new Employee2();
		Employee2 e4= new Employee2();
		Employee2 e5= new Employee2();
		//set value of e1 object
		e1.setEmp_id(1234);
		e1.setEmp_address("bhopal");
		e1.setEmp_name("harshita");
		//printing e1 value by get method
		System.out.println("employee id is:"+e1.getEmp_id());
		System.out.println("employee name is:"+e1.getEmp_name());
		System.out.println("employee address is:"+e1.getEmp_address());
		System.out.println();
		//set value of e2
		e2.setEmp_id(1235);
		e2.setEmp_address("lucknow");
		e2.setEmp_name("jyoti");
		//printing e2 value by get method
		System.out.println("employee id is:"+e2.getEmp_id());
		System.out.println("employee name is:"+e2.getEmp_name());
		System.out.println("employee address is:"+e2.getEmp_address());
		System.out.println();
		//set value of e3
		e3.setEmp_id(1236);
		e3.setEmp_address("jaipur");
		e3.setEmp_name("rohit");
		//printing e3 value by get method
		System.out.println("employee id is:"+e3.getEmp_id());
		System.out.println("employee name is:"+e3.getEmp_name());
		System.out.println("employee address is:"+e3.getEmp_address());
		System.out.println();
		
		e4.setEmp_id(1237);
		e4.setEmp_address("bhopal");
		e4.setEmp_name("rashi");
		//printing e1 value by get method
		System.out.println("employee id is:"+e4.getEmp_id());
		System.out.println("employee name is:"+e4.getEmp_name());
		System.out.println("employee address is:"+e4.getEmp_address());
		System.out.println();
		
		e5.setEmp_id(1238);
		e5.setEmp_address("rachi");
		e5.setEmp_name("harshit");
		//printing e1 value by get method
		System.out.println("employee id is:"+e5.getEmp_id());
		System.out.println("employee name is:"+e5.getEmp_name());
		System.out.println("employee address is:"+e5.getEmp_address());
		System.out.println();
	}

}
