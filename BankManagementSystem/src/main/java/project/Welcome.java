package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome implements ActionListener {
	
	JButton Deposit;
	JButton Credit;
	JButton Check;
	JButton Exit;
	JFrame frame;
	JTextField account_number ;
	JTextField pass;
	String account;
	
	
	Welcome(String Account){
		this.account=Account;
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
		
		String s ="<html>Dear user we cannot make call to your mobile number for deposit and credit money"
				+ " Please be aware from frauds .Our app is providing convience of bank transaction"
				+ " Thank you for being part of our family . ";
		
		JLabel warning = new JLabel(s);
		warning.setBounds(10, 70, 750, 100);
		warning.setFont(new Font("osward",Font.ITALIC,20));
		frame.add(warning);
		
		
		Deposit = new JButton("Deposit money");
		Deposit.setBounds(10, 200, 200, 30);
		Deposit.setBackground(Color.white);
		Deposit.setFont(new Font("osward",Font.BOLD,20));
		Deposit.setForeground(Color.BLACK);
		Deposit.addActionListener(this);
		frame.add(Deposit);
		
		Credit = new JButton("Transfer money");
		Credit.setBounds(10, 250, 200, 30);
		Credit.setFont(new Font("osward",Font.BOLD,20));
		Credit.addActionListener(this);
		Credit.setBackground(Color.white);
		Credit.setForeground(Color.BLACK);
		frame.add(Credit);
		
		Check = new JButton("Check balance");
		Check.setBounds(10, 300, 200, 30);
		Check.setFont(new Font("osward",Font.BOLD,20));
		Check.setBackground(Color.white);
		Check.addActionListener(this);
		Check.setForeground(Color.BLACK);
		frame.add(Check);
		
		Exit = new JButton("Exit");
		Exit.setBounds(10, 350, 200, 30);
		Exit.setFont(new Font("osward",Font.BOLD,20));
		Exit.setBackground(Color.white);
		Exit.addActionListener(this);
		Exit.setForeground(Color.BLACK);
		frame.add(Exit);
		
		
	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
	Image i2 = i1.getImage().getScaledInstance(800, 300, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		
		JLabel label = new JLabel(i3);
		label.setBounds(0, 170, 800, 300);
		frame.add(label);
		
		ImageIcon wall = new ImageIcon(ClassLoader.getSystemResource("icons/back.jpg"));
		JLabel wallpaper = new JLabel(wall);
		wallpaper.setBounds(0, 0, 800,600);
		frame.add(wallpaper);
		
	
		
		
		
	}
	
	public static void main(String[] args) {
		Welcome w = new Welcome("1234");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Deposit) {
			Deposit d = new Deposit(account);
			frame.setVisible(false);
			
		}
		else if(e.getSource()==Credit) {
			
			Credit c = new Credit(account);
			frame.setVisible(false);
			
		}
		else if(e.getSource()==Check){
			
			Balance b = new Balance(account);
			frame.setVisible(false);
			
		}
		else {
			System.exit(0);
		}
		
	}
	

}
