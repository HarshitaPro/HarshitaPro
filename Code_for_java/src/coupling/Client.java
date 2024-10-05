package coupling;

public class Client {
	public static void main(String[] args) {
		Employee_factory emp = new Employee_factory();
		
		Employee a= emp.getEmployee("android");
		Employee b = emp.getEmployee("web ");
		a.getSalary();
		b.getSalary();
		
		
		
	}

}
