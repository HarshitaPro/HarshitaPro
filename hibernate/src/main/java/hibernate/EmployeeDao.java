package hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class EmployeeDao {
	
	private Session session;
	
	EmployeeDao(Session session){
		this.session= session;
	}
	
	public void save(Employee e) {
		Transaction t = session.beginTransaction();
		session.save(e);
		t.commit();
		System.out.println("records save successfully");
	}
	
	public  void getData(int id) {
		
		Employee e = session.get(Employee.class, id);
		System.out.println(e);
	}
	
	public void update(int id) {
		Transaction t = session.beginTransaction();
		Employee e = session.get(Employee.class, id);
		session.saveOrUpdate(e);
		t.commit();
		
		
	}
	
	public void delete(int id) {
		Transaction t = session.beginTransaction();
		Employee e = session.get(Employee.class, id);
		session.delete(e);
		t.commit();
				
		
	}
	public void fetchAll() {
		
		Query q =session.createQuery("From Employee");
		q.executeUpdate();
		
		List<Employee>list=q.list();
		for(Employee e: list) {
			System.out.println(e);
		}
		
		
	}
	
	
	

}
