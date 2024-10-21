package many_to_many;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class GetData {
	
	
	public static void main(String[] args) {
		
		
		 Configuration config = new Configuration();
	       config.configure("manytomany.cfg.xml");
	       Session session = config.buildSessionFactory().openSession();
	       
	       
	       Question_2 que = session.get(Question_2.class, 112);
	       System.out.println(que.getQue_id());
	       System.out.println(que.getQuestion());
	       for(Answer i:que.getAnswer()) {
	    	   System.out.println(i.getAnswer());
	    	   
	       }
	       
	       
	       
	       
	}
     

}
