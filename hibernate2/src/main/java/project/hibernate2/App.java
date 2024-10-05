package project.hibernate2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
    
    {
    	
    	Configuration con = new Configuration();
    	con.configure("hibernate2.cfg.xml");
    	
    	SessionFactory factory = con.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction t = session.beginTransaction();
    	
    	
    	//object of class
       Student st = new Student();
       st.setId(11);
       st.setGender("male");
       st.setCity("bhopal");
       st.setName("harsh");
       st.setRollno(109);
       
      session.save(st);
      t.commit();
      session.close();
    
       
    	
    	
    	
    }
}
