package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class AdditionalDetails implements ActionListener {
	
	JButton submit;
	JRadioButton gender1 ;
	JRadioButton gender2;
	JRadioButton gender3;
	JRadioButton age1;
	JRadioButton age2;
	JRadioButton account1 ;
	JRadioButton account2; 
	ButtonGroup gender_group;
	ButtonGroup age_group;
	ButtonGroup account_group;
	JTextField adhar_field ;
	int Customer_id;
	JCheckBox c ;
	JFrame f;
	String name;
	
	
	
	
	public AdditionalDetails(String fname,String lname,int Customer_id){
		name = fname+" "+lname;
		
		f= new JFrame();
		f.setSize(700,700);
		f.setLayout(null);
		f.setVisible(true);
		this.Customer_id=Customer_id;
		f.setLocation(300, 0);
		
		JLabel heading = new JLabel("Registration details-2");
		heading.setFont(new Font("osward",Font.BOLD,25));
		heading.setBounds(10, 0, 500, 30);
		f.add(heading);
		
		JLabel heading2 = new JLabel(" Please fill the below information to create account");
		heading2.setFont(new Font("osward",Font.PLAIN,15));
		heading2.setBounds(10, 40, 500, 20);
		f.add(heading2);
		
		
		JLabel gender = new JLabel("Gender");
		gender.setFont(new Font("osward",Font.ITALIC,15));
		gender.setBounds(10, 100, 500, 20);
		f.add(gender);
		
		 gender1 = new JRadioButton("Male");
		gender1.setFont(new Font("osward",Font.ITALIC,15));
		gender1.setBounds(10, 130, 150, 20);
	
		f.add(gender1);
		
		 gender2 = new JRadioButton("Female");
		gender2.setFont(new Font("osward",Font.ITALIC,15));
		gender2.setBounds(200, 130,150, 20);
		f.add(gender2);
		
		 gender3 = new JRadioButton("Other");
		gender3.setFont(new Font("osward",Font.ITALIC,15));
		gender3.setBounds(400, 130,150, 20);
		f.add(gender3);
		
		gender_group = new ButtonGroup();
		gender_group.add(gender3);
		gender_group.add(gender2);
		gender_group.add(gender1);
		
		
		
		JLabel age = new JLabel("Age of Account holder");
		age.setFont(new Font("osward",Font.ITALIC,15));
		age.setBounds(10, 170, 500, 20);
		f.add(age);
		
		 age1 = new JRadioButton("Below 18");
		age1.setFont(new Font("osward",Font.ITALIC,15));
		age1.setBounds(10, 200, 150, 20);
		f.add(age1);
		
		 age2 = new JRadioButton("Above 18");
		age2.setFont(new Font("osward",Font.ITALIC,15));
		age2.setBounds(200, 200,150, 20);
		f.add(age2);
		
		 age_group = new ButtonGroup();
		age_group.add(age1);
		age_group.add(age2);
		
		
		
		JLabel adhar = new JLabel("Adhaar-card Number");
		adhar.setFont(new Font("osward",Font.ITALIC,15));
		adhar.setBounds(10,250,500,20);
		f.add(adhar);
		
		 adhar_field = new JTextField();
		adhar_field.setBounds(200, 250, 300, 30);
		f.add(adhar_field);
		
		JLabel nominee = new JLabel("Nominee name");
		nominee.setFont(new Font("osward",Font.ITALIC,15));
		nominee.setBounds(10,300,500,20);
		f.add(nominee);
		
		JTextField nominee_field = new JTextField();
		nominee_field.setBounds(200, 300, 300, 30);
		f.add(nominee_field);
		
		JLabel relation = new JLabel("Nominee relation  ");
		relation.setFont(new Font("osward",Font.ITALIC,15));
		relation.setBounds(10,350,500,20);
		f.add(relation);
		
		JTextField relation_field = new JTextField();
		relation_field.setBounds(200, 350, 300, 30);
		f.add(relation_field);
		

		JLabel account = new JLabel("Account_Type");
		account.setFont(new Font("osward",Font.ITALIC,15));
		account.setBounds(10,400,500,20);
		f.add(account);
		
		 account1 = new JRadioButton("Saving Account");
	account1.setFont(new Font("osward",Font.ITALIC,15));
		account1.setBounds(10, 430, 150, 20);
		f.add(account1);
		
		 account2 = new JRadioButton("Current Account");
		account2.setFont(new Font("osward",Font.ITALIC,15));
		account2.setBounds(200, 430,150, 20);
		f.add(account2);
		
	 account_group= new ButtonGroup();
		account_group.add(account1);
		account_group.add(account2);
		
		String para ="<html>The information provided in the registration form is correct up to"
				 +" your best knowledge If a bank found something against this information"
				+ "as fake id and some what the bank will seal your account and take "
				+ "strict action against you<html>";
		JLabel agreement = new JLabel(para);
		agreement.setFont(new Font("osward",Font.ITALIC,15));
		agreement.setBounds(0, 500,700 ,60);
		f.add(agreement);
		
		JLabel check = new JLabel("Yes I agree");
		check.setBounds(0,580,200,20);
		check.setFont(new Font ("osward",Font.BOLD,15));
		f.add(check);
		
		 c = new JCheckBox();
		c.setBackground(Color.white);
		c.setBounds(100, 580, 100, 20);
		f.add(c);
		
		submit = new JButton("submit");
		submit.setBackground(Color.black);
		submit.setForeground(Color.white);
		submit.setBounds(580,600,100,30);
		submit.addActionListener(this);
		f.add(submit);
		   
		
		 ImageIcon wall = new ImageIcon(ClassLoader.getSystemResource("icons/wallpaper.jpg"));
	     JLabel wallpaper = new JLabel(wall);
		wallpaper.setBounds(0, 0, 800,600);
		f.add(wallpaper);
		
			
		
	}
	
	public static void main(String[] args) {
		// AdditionalDetails ad = new AdditionalDetails(8097);
		 
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(c.isSelected())
		{
	
		String gender=null;
		if(gender1.isSelected()) {
			gender="male";
		}
		else if(gender2.isSelected()){
			gender="female";
		}
		else {
			JOptionPane op = new JOptionPane();
			op.showMessageDialog(op, "Please select the Gender");
			
				op.setBounds(200, 200, 400, 50);
					f.add(op);
		}
		
		String age=null;
		
		if(age1.isSelected()) {
			age="below18";
		}
		else if(age2.isSelected()){
			age="above18";
		}
		else {
			JOptionPane op = new JOptionPane();
			op.showMessageDialog(op, "Please select the age");
			
				op.setBounds(200, 200, 400, 50);
					f.add(op);
		}
		
		String acc=null;
		
		if(account1.isSelected()) {
			acc="Saving account";
		}
		else if(account2.isSelected()){
			acc="Current Account";
		}
		else {
			JOptionPane op = new JOptionPane();
			op.showMessageDialog(op, "Please select the account type");
			
				op.setBounds(200, 200, 400, 50);
					f.add(op);
		}
		String Adhar=null;
		if(adhar_field.getText()=="") {
			JOptionPane op = new JOptionPane();
			op.showMessageDialog(op, "Please enter the adhar number");
			
				op.setBounds(200, 200, 400, 50);
					f.add(op);
			
		}else {
		 Adhar=adhar_field.getText();
		}
		ConnectionD con= new ConnectionD();
		  try {
				PreparedStatement ps = con.conn.prepareStatement("insert into personal_details2(gender,age,aadhar,acc_type,customer_id)values(?,?,?,?,?)");
			ps.setString(1, gender);
			ps.setString(2, age);
			ps.setString(3, Adhar);
			ps.setString(4, acc);
			ps.setInt(5, Customer_id);
			
			ps.executeUpdate();

			System.out.println("successfully done");
			
			Account a = new Account(name,Customer_id);
			f.setVisible(false);
			} catch (SQLException e1) {
				
				e1.getMessage();
			}
		} else {
			JOptionPane op = new JOptionPane();
	op.showMessageDialog(op, "Please select the CheckBox");
	
		op.setBounds(200, 200, 400, 50);
			f.add(op);
		}
		
		
	}
	
	

}
