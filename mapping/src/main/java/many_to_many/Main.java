package many_to_many;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	
	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("manytomany.cfg.xml");
		Session session = config.buildSessionFactory().openSession();
		
		Transaction t = session.beginTransaction();
		
		//creating objects 
		
		Question_2 q1 = new Question_2();
		q1.setQue_id(111);
		q1.setQuestion("what is java");
		
		Question_2 q2 = new Question_2();
		q2.setQue_id(112);
		q2.setQuestion("what do you mean by java");
		
		Question_2 q3 = new Question_2();
		q3.setQue_id(113);
		q3.setQuestion("What do you understand by java");
		
		Answer a1 = new Answer();
		a1.setAns_id(121);
		a1.setAnswer("java is ka programming language that support many object oriented programming features");
		
		Answer a2 = new Answer();
		a2.setAns_id(123);
		a2.setAnswer("java is high level programming language ");
		
		Answer a3 = new Answer();
	a3.setAns_id(124);
	a3.setAnswer("java is object oriented language as it support object classes encapsulation and more oops feature");
	
	ArrayList<Question_2> question= new ArrayList<>();
	question.add(q1);
	question.add(q2);
	question.add(q3);
	
	ArrayList<Answer> answer = new ArrayList<>();
	answer.add(a1);
	answer.add(a2);
	answer.add(a3);
	
	q1.setAnswer(answer);
	q2.setAnswer(answer);
	q3.setAnswer(answer);
	
	a1.setQuestion(question);
	a2.setQuestion(question);
	a3.setQuestion(question);
	
	session.save(q1);
	session.save(q2);
	session.save(q3);
	
	session.save(a1);
	session.save(a2);
	session.save(a3);
	
	t.commit();
	
	
		
		
		
		
		
	}

}
