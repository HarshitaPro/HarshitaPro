package one_to_one;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
       Configuration config = new Configuration();
       config.configure("hibernate.cfg.xml");
       Session session = config.buildSessionFactory().openSession();
       
       Transaction t = session.beginTransaction();
       
       //creting objects
       Question que1 = new Question();
       que1.setQue_id(1);
       que1.setQuestion("what is oops ?");
       
       Answer ans1 = new Answer();
       ans1.setAns_id(12);
       ans1.setAnswer("it is programming paradigm");
       que1.setAnswer(ans1);
       
       Question que2 = new Question();
       que2.setQue_id(2);
       que2.setQuestion("what is java ?");
       
       Answer ans2 = new Answer();
       ans2.setAns_id(13);
       ans2.setAnswer("it is programming language");
       que2.setAnswer(ans2);
       
     session.save(que1);
     session.save(ans1);
     session.save(que2);
     session.save(ans2);
     t.commit();
     
     Question question= session.get(Question.class, 1);
     System.out.println(question.getQue_id());
     System.out.println(question.getQuestion());
     System.out.println(question.getAnswer().getAnswer());
   
       
       
       
    }      
       
       
}
