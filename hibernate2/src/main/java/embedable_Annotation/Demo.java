package embedable_Annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo {
	
	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("hibernate2.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		//object of address class
		Address add = new Address();
		add.setCity("indore");
		add.setPincode(432022);
		add.setState("mp");
		//object of Student class

		Student st2 = new Student();
		st2.setAddress(add);
		st2.setId(2);
		st2.setName("harsh");
		
		session.save(st2);
		t.commit();
		
	}

}
