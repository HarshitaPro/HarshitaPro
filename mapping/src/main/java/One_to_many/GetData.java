package One_to_many;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class GetData {
	public static void main(String[] args) {
		
	
	
	 Configuration config = new Configuration();
     config.configure("hibernate.cfg.xml");
     Session session = config.buildSessionFactory().openSession();
     //getting the data 
    Question question = session.get(Question.class, 1);
    
    System.out.println(question.getQuestion());
    for(Answer ans: question.getList()) {
    	
    	System.out.println(ans.toString());
    	
    }
    
	}  
}
