package com.hibernate_example.hibernate_first_project;

import java.io.FileInputStream;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	//public Student(int rollno, String city, String state, String mob) {
    	// public Student_Address(int addID, String street, String city, String state, byte[] image) {
       Student s = new Student();
     
       s.setMob("9179580001");
       s.setRollno(101);
      
       FileInputStream fis = new FileInputStream("src/main/java/my_img.jpg");
       byte[]img = fis.readAllBytes();
       
       Student_Address s3 = new Student_Address(12,"raisen road","bhopal","mp",img);
      
      
       
       Configuration c = new Configuration();
       c.configure("hibernate.cfg.xml");
       SessionFactory factory = c.buildSessionFactory();
       Session sess = factory.openSession() ;
      
       Transaction tx = sess.beginTransaction();
       sess.persist(s);
       sess.persist(s3);
      
       tx.commit();
       sess.close();
     
      
    }

	
}
