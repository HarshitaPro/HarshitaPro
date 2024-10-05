package anudip.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	
	public static void main(String[] args) {
		
		Student st = new Student();
	      st.setStd_id(102);
	      st.setRollno(12);
	      st.setName("harsh");
	      st.setGender("male");
	      st.setEmail("harshit@gmail.com");
	      st.setCity("bhopal");
	      
	    Configuration con = new Configuration();
	    con.configure("hibernate.cfg.xml");
	   SessionFactory factory = con.buildSessionFactory();
	   Session session = factory.openSession();
	   Transaction transaction = session.beginTransaction();
	   session.save(st);
	   transaction.commit();
	   
		
	}

}
