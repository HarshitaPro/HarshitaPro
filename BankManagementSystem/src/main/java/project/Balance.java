package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Balance implements ActionListener{
	
	JFrame frame;
	JTextField amount_field;
	JTextField pin_field;
	JButton confirm;
	JButton back;
	String Account;
	int amount;
	String type;
	
	public Balance(String Account) {
		
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
		
	   
		ConnectionD d = new ConnectionD();
		try {
			PreparedStatement ps = d.conn.prepareStatement("Select amount,type from Amount where account_no=?");
			ps.setString(1, Account);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				if(rs.getString("type").equalsIgnoreCase("deposit")) {
					amount = amount+rs.getInt("amount");
				}
				else {
					amount= amount-rs.getInt("amount");
				}
			}
			
			JLabel bal = new JLabel("Your Account Balance :"+amount);
			bal.setFont(new Font("osward",Font.ITALIC,30));
			bal.setBounds(30, 100, 500, 30);
			frame.add(bal);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
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
		Welcome w = new Welcome(Account);
		frame.setVisible(false);
		
	}

	
	}
	

		
		
	


