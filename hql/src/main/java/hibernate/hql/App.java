package hibernate.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Configuration config = new Configuration();
       config.configure("hibernate.cfg.xml");
       Session session = config.buildSessionFactory().openSession();
       Transaction t = session.beginTransaction();
       
       //creating objects
       
       Student std1 = new Student();
       std1.setName("harshita");
       std1.setStd_id(101);
       
       Certificate certi1 = new Certificate();
       certi1.setCourse("java");
       certi1.setDuration("3months");
       std1.setCertificate(certi1);
       
       Student std2 = new Student();
       std2.setName("simran");
       std2.setStd_id(102);
       
       Certificate certi2 = new Certificate();
       certi2.setCourse("java");
       certi2.setDuration("3months");
       std2.setCertificate(certi2);
       
       Student std3 = new Student();
       std3.setName("reena");
       std3.setStd_id(103);
       
       Certificate certi3 = new Certificate();
       certi3.setCourse("python");
       certi3.setDuration("6months");
       std3.setCertificate(certi3);
       
       Student std4 = new Student();
       std4.setName("harsh");
       std4.setStd_id(104);
       
       Certificate certi4 = new Certificate();
       certi4.setCourse("python");
       certi4.setDuration("3months");
       std4.setCertificate(certi4);
       
    session.save(std1);
      session.save(std2);
       session.save(std3);
       session.save(std4);
       
       t.commit();
       
   /*    String query = "delete from Student as S where S.std_name=:x";
       
       Query q = session.createQuery(query);
       q.setParameter("x", "harshita");
       
       
     int res= q.executeUpdate();
     System.out.println(res);
    /**  List<Student>list= q.getResultList();
      
      for(Student i :list) {
    	  System.out.println(i.getName()+" "+i.getCertificate().getCourse());
      }*/
      
      
       
       
       
       
       
       
       
       
       
    }
}
