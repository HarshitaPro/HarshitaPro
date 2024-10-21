package project.Hibernate_mapping;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	
	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		Session session = config.buildSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		
		//creating object
	Question que = new  Question();
	Answer ans = new Answer();
	ans.setAns_id(134);
	ans.setAnswer("java is programming language");
	que.setAnswer(ans);
	que.setQuestion("What is java");
	que.setQuestion_id(234);
	session.save(que);
	session.save(ans);
	t.commit();
		
	}

}
