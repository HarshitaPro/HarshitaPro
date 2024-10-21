package hibernate;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Main {
	
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernatee.cfg.xml");
		Session session = config.buildSessionFactory().openSession();
		EmployeeDao emp = new EmployeeDao(session);
		
	Employee e = new Employee(11,"harsh","1234567890","IT");
	emp.getData(11);
	
		
	}
}