package embedable_Annotation;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	
	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("hibernate2.cfg.xml");
		Session session = config.buildSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setDepartment("sales");
		emp.setId(11);
		emp.setName("harsh");
		
		Certificate cer = new Certificate();
		cer.setCourse("call executive");
		cer.setDuration("3 months");
		emp.setCertificate(cer);
		
		session.save(emp);
		t.commit();
		
		
		
		
	}

}
