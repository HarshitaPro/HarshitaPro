package One_to_many;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	
	public static void main(String[] args) {
		
		 Configuration config = new Configuration();
	       config.configure("hibernate.cfg.xml");
	       Session session = config.buildSessionFactory().openSession();
	       
	       Transaction t = session.beginTransaction();
	       
	       //creating objects
	       
	       Question que1 = new Question();
	       que1.setQue_id(2);
	       que1.setQuestion("what is hibernate");
	       
	       Answer ans1 = new Answer();
	       ans1.setAns_id(123);
	       ans1.setAnswer("It is a orm tool");
	       ans1.setQuestion(que1);
	       
	       Answer ans2 = new Answer();
	       ans2.setAns_id(124);
	       ans2.setAnswer("it is used to interact with database easily");
	       ans2.setQuestion(que1);
	       
	       Answer ans3 = new Answer();
	       ans3.setAns_id(125);
	       ans3.setAnswer("it is not part of java ,java persistence class is used for hibernate");
	       ans3.setQuestion(que1);
	       
	       ArrayList<Answer> list = new ArrayList<>();
	       list.add(ans1);
	       list.add(ans2);
	       list.add(ans3);
	       
	       que1.setList(list);
	       
	       session.save(que1);
	       session.save(ans1);
	       session.save(ans2);
	       session.save(ans3);
	       
	       t.commit();
	       
	       
		
	}

}
