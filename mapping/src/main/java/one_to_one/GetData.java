package one_to_one;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GetData {
	
	public static void main(String[] args) {
		
		 Configuration config = new Configuration();
	       config.configure("hibernate.cfg.xml");
	       Session session = config.buildSessionFactory().openSession();
	       
	    //to run this firstly change hbmddl.auto=update  
	      Question question= session.get(Question.class, 1);
	        System.out.println(question.getQue_id());
	        System.out.println(question.getQuestion());
	        System.out.println(question.getAnswer().getAnswer());
	      
	       
		
	  
	}

}
