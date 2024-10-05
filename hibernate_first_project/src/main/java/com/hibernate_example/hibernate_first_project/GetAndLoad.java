package com.hibernate_example.hibernate_first_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetAndLoad {
	
	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		
		config.configure("hibernate.cfg.xml");
		
		SessionFactory factory = config.buildSessionFactory();
		Session s = factory.openSession();
		Student student = (Student)s.get(Student.class, 101);
		//System.out.println(student);
		
		Student_Address sa = (Student_Address) s.load(Student_Address.class, 12);
		System.out.println(sa.getCity());
		
	
		
		
		
		
		
	}

}
