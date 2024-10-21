package project;
import javax.swing.*;

import org.jboss.jandex.Main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Forgot implements ActionListener {
	
	JFrame frame;
	JButton confirm;
	JButton back;
	 JTextField m ;
	 JTextField id;
	
	
	     Forgot(){
	    	 
	    		frame = new JFrame();
	    		frame.setSize(800, 480);
	    		frame.setLayout(null);
	    		frame.setTitle("loginPage_loadded");
	    		
	    		frame.setVisible(true);
	    		frame.setLocation(150, 100);
	    		
	    		JLabel  message = new JLabel("Welcome Dear, Now you can retrieve your password!");
	    		message.setFont(new Font("osward",Font.ROMAN_BASELINE,20));
	    		message.setBounds(0,10,800,30);
	    		frame.add(message);
	    		
	    		
	    		
	    		JLabel cid = new JLabel("Enter your Customer Id");
	    		cid.setBounds(50,100,300,30);
	    		cid.setFont(new Font("osward",Font.ITALIC,20));
	    		frame.add(cid);
	    		
	    		 id = new JTextField();
	    			id.setBounds(300, 100, 200, 30);
	    			frame.add(id);
	    			
	    			JLabel mother = new JLabel("Enter your Mother name ");
		    		mother.setBounds(50,150,300,30);
		    		mother.setFont(new Font("osward",Font.ITALIC,20));
		    		frame.add(mother);
		    		
		    		m= new JTextField();
		    			m.setBounds(300, 150, 200, 30);
		    			frame.add(m);
		    			
		    			confirm = new JButton("Confirm");
		    			confirm.setBounds(400, 200, 100, 30);
		    			confirm.setBackground(Color.black);
		    			confirm.setForeground(Color.white);
		    			confirm.addActionListener(this);
		    			frame.add(confirm);
		    			
		    			back= new JButton("Back");
		    			back.setBounds(280, 200, 100, 30);
		    			back.setBackground(Color.black);
		    			back.setForeground(Color.white);
		    			back.addActionListener(this);
		    			frame.add(back);
		    			
		    			
		    			
		    			ImageIcon wall = new ImageIcon(ClassLoader.getSystemResource("icons/back.jpg"));
		    			JLabel wallpaper = new JLabel(wall);
		    			wallpaper.setBounds(0, 0, 800,600);
		    			frame.add(wallpaper);
	    			
	    		
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	     }
	     
	     public static void main(String[] args) {
	    	 new Forgot();
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==confirm) {
				
				if(!m.getText().isEmpty()||!id.getText().isEmpty()) {
					
					ConnectionD d = new ConnectionD();
					 try {
						PreparedStatement s=d.conn.prepareStatement("select Account_no,pin from Account_details where customer_id=?");
						s.setString(1, id.getText());
						PreparedStatement s2 = d.conn.prepareStatement("select mothername from personal_details where customerid=?");
						s2.setString(1, id.getText());
						ResultSet rs = s.executeQuery();
						ResultSet rs2 = s2.executeQuery();
						
						System.out.println("searching");
						
						while(rs.next() && rs2.next()) {
							if(rs2.getString("Mothername").equalsIgnoreCase(m.getText())) {
							
								JOptionPane op = new JOptionPane();
								op.showMessageDialog(op, "Account Number:"+rs.getString("Account_no")+"\n pin :"+rs.getString("pin"));
								frame.add(op);
								id.setText("");
								m.setText("");
							}
							else {
								JOptionPane op = new JOptionPane();
								op.showMessageDialog(op, "No Data Found");
								frame.add(op);
								id.setText("");
								m.setText("");
							}
						}
						
						
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
				} else {
					JOptionPane op = new JOptionPane();
					op.showMessageDialog(op, "Please Enter Text");
					frame.add(op);
					id.setText("");
					m.setText("");
				
				}
			}
			
			
			else {
				
				new LoginPage();
				frame.setVisible(false);
				
			}
			
		}
	

}
