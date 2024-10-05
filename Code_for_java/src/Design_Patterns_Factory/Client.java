package Design_Patterns_Factory;

public class Client {

	public static void main(String[] args) {
		
		Employee_Factory ef = new Employee_Factory();
	
		Employee e = ef.Get_emp_salary("android Deveploper");
		System.out.println(e.Salary());
		
		Employee e2 = ef.Get_emp_salary("Web Developer");
		System.out.println(e2.Salary());
		

	}

}
