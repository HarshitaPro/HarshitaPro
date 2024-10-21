package hibernate.hql;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class CrudOperations {
	
	public static void main(String[] args) {
		
		   Configuration config = new Configuration();
	       config.configure("hibernate.cfg.xml");
	       Session session = config.buildSessionFactory().openSession();
	       Transaction t = session.beginTransaction();
	       //for update the data
	       Query q = session.createQuery("update Student set name=:n where name=:x");
	       q.setParameter("n", "harsh");
	       q.setParameter("x", "102");
	       //for delete 
	       Query q2 = session.createQuery("delete from Student where std_id=:id");
	       q2.setParameter("id",102);
	       q2.executeUpdate();
	     
	       q.executeUpdate();
	       t.commit();
	     
	     
	       
		
	}

}
