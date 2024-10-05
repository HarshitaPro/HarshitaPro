package embedable_object;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	
	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("embedable.cfg.xml");
		SessionFactory sf = config.buildSessionFactory();
		Session s = sf.openSession();
		
		//address class object
		Address add = new Address(17,"bhopal","mp");
		Address add2 = new Address(12,"ranchi","jharkhand");
		//Student object
		//public Student(String name, int rollno, String mob, Address add) {
		Student student1 = new Student("harshita",101,"6263323361",add);
		Student student2 = new Student("rahul",102,"9179580001",add2);
		
		Transaction tc = s.beginTransaction();
		s.persist(student1);
		s.persist(student2);
		tc.commit();
		s.close();
		sf.close();
		
		
	}

}
