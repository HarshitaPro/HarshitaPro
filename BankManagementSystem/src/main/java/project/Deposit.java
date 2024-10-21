package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Deposit implements ActionListener{
	
	JFrame frame;
	JTextField amount_field;
	JTextField pin_field;
	JButton confirm;
	JButton back;
	String Account;
	Deposit(String Account){
		this.Account=Account;
		frame = new JFrame();
		frame.setSize(800, 480);
		frame.setLayout(null);
		frame.setTitle("loginPage_loadded");
		
		frame.setVisible(true);
		frame.setLocation(150, 100);
		
		JLabel  message = new JLabel("Welcome Dear, Now you perform bank Transaction with ease!");
		message.setFont(new Font("osward",Font.ROMAN_BASELINE,20));
		message.setBounds(0,10,800,30);
		frame.add(message);
		
		JLabel amount = new JLabel("Enter Amount");
		amount.setBounds(50,100,200,30);
		amount.setFont(new Font("osward",Font.ITALIC,20));
		frame.add(amount);
		
		 amount_field = new JTextField();
		amount_field.setBounds(250, 100, 200, 30);
		frame.add(amount_field);
		
		JLabel pin = new JLabel("Enter Pin");
		pin.setBounds(50,150,200,30);
		pin.setFont(new Font("osward",Font.ITALIC,20));
		frame.add(pin);
		
		 pin_field = new JTextField();
		pin_field.setBounds(250, 150, 200, 30);
		frame.add(pin_field);
		
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
		Deposit d = new Deposit("1005663691");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==confirm) {
			
			if(!amount_field.getText().equals("") || !pin_field.getText().equals("")||!amount_field.getText().contains("a-z")) {
				
				ConnectionD con = new ConnectionD();
				System.out.println("done");
				String pin="000";
				try {
					PreparedStatement ps1 =con.conn.prepareStatement("Select pin from Account_details where Account_no=?");
					ps1.setString(1, Account);
					System.out.println("searching pin");
					ResultSet rs = ps1.executeQuery();
					while(rs.next()) {
						pin= rs.getString("pin");
					}
					if(pin.equals(pin_field.getText())) {
						

					PreparedStatement ps =con.conn.prepareStatement("Insert into Amount(account_no,pin,amount,type)values(?,?,?,?)");
					ps.setString(1, Account);
					ps.setString(2, pin_field.getText());
				     ps.setString(3, amount_field.getText());
				     ps.setString(4,"Deposit");
				     ps.executeUpdate();
				     JOptionPane op = new JOptionPane();
						op.showMessageDialog(op, "transaction successfull");
						frame.add(op);
				    
				     System.out.println("done");
					}	
					else {
						JOptionPane op = new JOptionPane();
						op.showMessageDialog(op, "enter valid details");
						frame.add(op);
						
					}
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
			else {
				JOptionPane op = new JOptionPane();
				op.showMessageDialog(op, "enter valid details");
				frame.add(op);
			}
			
			
		}
		else {
			
			Welcome w = new Welcome(Account);
			frame.setVisible(false);
		}
		
	}
	

}
