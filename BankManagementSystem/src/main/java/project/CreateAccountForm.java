package project;

import javax.swing.*;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class CreateAccountForm implements ActionListener {
	
	 JTextField city_field;
	 JTextField fname_field;
	 JTextField Lname_field;
		JTextField Mothername_field ;
		JTextField phone_field;
		 JTextField email_field;
		 JTextField HNo_field;
		 JTextField State_field;
		 JTextField pin_field;
		 int customer_id;
		 JButton next;
		 JFrame f;
		 
		 
	 
	
	public CreateAccountForm() {
		
		Random ran = new Random();
		 customer_id= (int)Math.abs(ran.nextLong()%9000L+1000L);
		 System.out.println(customer_id);
		
				
		
		 f = new JFrame();
		f.setVisible(true);
		f.setSize(800, 700);
		f.setLayout(null);
		f.setLocation(300, 0);
		
		
		JLabel heading = new JLabel("Bank Registration Form");
		heading.setFont(new Font("osward",Font.BOLD,25));
		heading.setBounds(10, 0, 500, 30);
		f.add(heading);
		
		JLabel heading2 = new JLabel(" Please fill the below information to create a account");
		heading2.setFont(new Font("osward",Font.PLAIN,15));
		heading2.setBounds(10, 40, 500, 20);
		f.add(heading2);
		
		JLabel fname = new JLabel("First Name");
		fname.setFont(new Font("osward",Font.ITALIC,15));
		fname.setBounds(10, 100, 500, 20);
		f.add(fname);
		
		 fname_field = new JTextField();
		fname_field.setBounds(10, 120, 200, 30);
	     f.add(fname_field);
	     
	     JLabel Mname = new JLabel("Middle Name");
			Mname.setFont(new Font("osward",Font.ITALIC,15));
			Mname.setBounds(230, 100, 500, 20);
			f.add(Mname);
			
			JLabel Lname = new JLabel("Last Name");
			Lname.setFont(new Font("osward",Font.ITALIC,15));
			Lname.setBounds(450, 100, 500, 20);
			f.add(Lname);
	     
			JTextField Mname_field = new JTextField();
			Mname_field.setBounds(230, 120, 200, 30);
		     f.add(Mname_field);
		     
		 	 Lname_field = new JTextField();
			Lname_field.setBounds(450, 120, 200, 30);
		     f.add(Lname_field);
		     
		     
		     JLabel Mother_name= new JLabel("Mother Name");
				Mother_name.setFont(new Font("osward",Font.ITALIC,15));
				Mother_name.setBounds(10, 160, 500, 20);
				f.add(Mother_name);
				
				
			 Mothername_field = new JTextField();
				Mothername_field.setBounds(10, 180, 200, 30);
			     f.add(Mothername_field);
			     
			     //DoB..........
			     
		     
		     
		     //phone,email
			     
			     JLabel phone= new JLabel("Phone Number");
					phone.setFont(new Font("osward",Font.ITALIC,15));
					phone.setBounds(10, 220, 500, 20);
					f.add(phone);
					
			phone_field = new JTextField();
			phone_field.setBounds(10, 240, 300, 30);
		     f.add(phone_field);
				     
			 JLabel email= new JLabel("Email Address");
		     email.setFont(new Font("osward",Font.ITALIC,15));
			email.setBounds(400, 220, 500, 20);
			f.add(email);
						
		   email_field = new JTextField();
		   email_field.setBounds(400, 240, 300, 30);
		    f.add(email_field);
		    
		    
		    //Address
		    
		    JLabel Adress= new JLabel("Address of Account Holder");
		     Adress.setFont(new Font("osward",Font.PLAIN,20));
			Adress.setBounds(10, 300, 500, 30);
			f.add(Adress);
			
			 JLabel HNo= new JLabel("House Number");
		     HNo.setFont(new Font("osward",Font.ITALIC,15));
			HNo.setBounds(10, 350, 500, 20);
			f.add(HNo);
		    
			 HNo_field = new JTextField();
			 HNo_field.setBounds(10, 370, 300, 30);
			  f.add(HNo_field);
		    
					     
			  JLabel Street= new JLabel("Street");
			     Street.setFont(new Font("osward",Font.ITALIC,15));
				Street.setBounds(400, 350, 500, 20);
				f.add(Street);
				
				
				JTextField Street_field = new JTextField();
				 Street_field.setBounds(400, 370, 300, 30);
				  f.add(Street_field);
			    
				  JLabel landmark= new JLabel("LandMark");
				     landmark.setFont(new Font("osward",Font.ITALIC,15));
					landmark.setBounds(10, 430, 500, 20);
					f.add(landmark);
					
					
					JTextField landmark_field = new JTextField();
					 landmark_field.setBounds(10, 450, 300, 30);
					  f.add(landmark_field);
					  
			JLabel city= new JLabel("City");
		    city.setFont(new Font("osward",Font.ITALIC,15));
		    city.setBounds(400, 430, 500, 20);
			f.add(city);
						
					  
			 city_field = new JTextField();
			city_field.setBounds(400, 450, 300, 30);
			 f.add(city_field);
						  
				  JLabel State= new JLabel("State");
			 State.setFont(new Font("osward",Font.ITALIC,15));
			State.setBounds(10, 490, 500, 20);
			f.add(State);
							
			  State_field = new JTextField();
			State_field.setBounds(10, 510, 300, 30);
			 f.add(State_field);
							  
	   JLabel pin= new JLabel("Pincode");
	 pin.setFont(new Font("osward",Font.ITALIC,15));
	 pin.setBounds(400, 490, 500, 20);
	f.add(pin);
				
		  pin_field = new JTextField();
		pin_field.setBounds(400, 510, 300, 30);
		 f.add(pin_field);
		 
		
					 
		  	 
		  next = new JButton("Next");
		 next.setBounds(600,600, 100, 30);
		 next.setBackground(Color.black);
		 next.setForeground(Color.white);
		 next.addActionListener(this);
		 f.add(next);
		 
		 ImageIcon wall = new ImageIcon(ClassLoader.getSystemResource("icons/wallpaper.jpg"));
	     JLabel wallpaper = new JLabel(wall);
		wallpaper.setBounds(0, 0, 800,600);
		f.add(wallpaper);
		   
								
		
		
		
		
	}
	public static void main(String[] args) {
		
		
		
		 CreateAccountForm cf = new  CreateAccountForm();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(!fname_field.getText().isEmpty()||!Lname_field.getText().isEmpty()||!Mothername_field.getText().isEmpty()||!phone_field.getText().isEmpty()||!email_field.getText().isEmpty()||!HNo_field.getText().isEmpty()||!city_field.getText().isEmpty()||!State_field.getText().isEmpty()||!pin_field.getText().isEmpty()) {	
		String name = fname_field.getText();
		String lname = Lname_field.getText();
		String mother =  Mothername_field.getText();
		String phone = phone_field.getText();
		String email= email_field.getText();
		String Hno = HNo_field.getText();
		String city= city_field.getText();
		String State = State_field.getText();
		String pin = pin_field.getText();
		ConnectionD con= new ConnectionD();
		
		
	   try {
		PreparedStatement ps = con.conn.prepareStatement("insert into personal_details(customerid,firstname,lastname,mothername,phone,email,houseno,city,state,pincode)values(?,?,?,?,?,?,?,?,?,?)");
	ps.setInt(1, customer_id);
	ps.setString(2, name);
	ps.setString(3, lname);
	ps.setString(4, mother);
	ps.setString(5, phone);
	ps.setString(6, email);
	ps.setString(7, Hno);
	ps.setString(8, city);
	ps.setString(9, State);
	ps.setString(10, pin);
	ps.executeUpdate();
	con.conn.close();

	System.out.println("successfully done");
		
	} catch (SQLException e1) {
		
		e1.printStackTrace();
	}
		
		f.setVisible(false);
		AdditionalDetails add = new AdditionalDetails(name, lname, customer_id);
			
		}else {
			JOptionPane op = new JOptionPane();
			op.showMessageDialog(op, "Please fill all details");
			f.add(op);
			
		}
		
		
	}
}	


