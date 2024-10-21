package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class Account implements ActionListener{
	String account_no;
	String name;
	int C_id;
	JButton submit;
	JFrame f;
	JTextField pin ;
	
	public Account(String name, int Customer_id){
		this.name= name;
		this.C_id=Customer_id;
		
		 f = new JFrame();
		f.setSize(600, 500);
		f.setLocation(300,100);
		f.setVisible(true);
		f.setLayout(null);
		
		Random ran = new Random();
		long no =Math.abs(ran.nextLong()%9+1000000000+5432189) ;
		 account_no = Long.toString(no);
		
		
		JLabel congo = new JLabel("Congratulations "+name +",your Account created Successfully!");
		congo.setBounds(0, 0, 500, 30);
		congo.setFont(new Font("osward",Font.ITALIC,15));
		f.add(congo);
		
		JLabel customer_id = new JLabel("your customer id :"+C_id);
		customer_id.setFont(new Font("osward",Font.ITALIC,15));
		customer_id.setBounds(20, 50, 200, 20);
		f.add(customer_id);
		
		
		
		
		JLabel show_account = new JLabel("Your Account Number :"+account_no);
		show_account.setBounds(50, 100, 500, 20);
		
		show_account.setFont(new Font("osward",Font.ITALIC,15));
		f.add(show_account);
		
		JLabel set_pin = new JLabel("please  set 6- digit  pin");
        set_pin.setBounds(50, 150, 500, 20);
		
		set_pin.setFont(new Font("osward",Font.ITALIC,15));
		f.add(set_pin);
		
	     pin = new JTextField();
		pin.setBounds(50, 170, 200, 30);
		f.add(pin);
		
		String s = "<html> This pin is password of your account while using the app."
				+ "You can login using this account number and pin .Do not share your pin with anyone"
				+ " it can cause fraud. Now you can easily perform the transaction in your account Thank you <html>";
				
				                  
				         
		JLabel warning = new JLabel(s);
		warning.setBounds(5, 210, 500, 100);
		warning.setFont(new Font("osward",Font.ITALIC,15));
		f.add(warning);
		
		

		submit = new JButton("Back to Login page");
		submit.setBackground(Color.black);
		submit.setForeground(Color.white);
		submit.setBounds(400,300,160,30);
		submit.addActionListener(this);
		f.add(submit);
		
		
		
		 ImageIcon wall = new ImageIcon(ClassLoader.getSystemResource("icons/wallpaper.jpg"));
	     JLabel wallpaper = new JLabel(wall);
		wallpaper.setBounds(0, 0, 600,500);
		f.add(wallpaper);
	
			
	}
	
	
public static void main(String[] args) {
	Account a = new Account("hello ",8737);
}


@Override
public void actionPerformed(ActionEvent e) {
	
	if(pin.getText()=="" ) {
		
		JOptionPane op = new JOptionPane();
		op.showMessageDialog(op, "Please enter pin CheckBox");
		
			op.setBounds(200, 200, 400, 50);
				f.add(op);
	}
	
	
	else {
	String pass = pin.getText();
	ConnectionD conn = new ConnectionD();
	try {
		
		PreparedStatement ps =conn.conn.prepareStatement
		("insert into Account_details(customer_id,Account_no,pin) values(?,?,?)");
		ps.setInt(1, C_id);
		ps.setString(2, account_no);
		ps.setString(3, pass);
		ps.executeUpdate();
		//System.out.println("successfully done");
		f.setVisible(false);
		LoginPage log = new LoginPage();
		
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	}
}
}
