package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginPage implements ActionListener{
	
	JButton submit;
	JButton forgot;
	JButton new_user;
	JFrame frame;
	JTextField account_number ;
	JTextField pass;
	
	public LoginPage() {
		
		frame = new JFrame();
		frame.setSize(800, 480);
		frame.setLayout(null);
		frame.setTitle("loginPage_loadded");
		
		frame.setVisible(true);
		frame.setLocation(150, 100);
		
		frame.getContentPane().setBackground(Color.white);
		//adding image of bank logo
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/banklog.png"));
		Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		
		JLabel ImageLabel = new JLabel(i3);
		ImageLabel.setBounds(50,20,70,70);
		frame.add(ImageLabel);
		
		//adding heading of bank Management system
		
		JLabel heading = new JLabel("Welcome to the Bank");
		heading.setBounds(120,40,500,35);
		heading.setBackground(Color.green);
		heading.setFont(new Font("osward",Font.BOLD,20));
		frame.add(heading);
		
		//login icon
	
	ImageIcon logo = new ImageIcon(ClassLoader.getSystemResource("icons/images.png"));
	Image logo2 = logo.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
	ImageIcon logo3 = new ImageIcon(logo2);
	JLabel loginlogo = new JLabel(logo3);
	loginlogo.setBounds(150,100,70,70);
	frame.add(loginlogo);
	
	JLabel logoname = new JLabel("Login");
	logoname.setBounds(160,160,100,30);
	logoname.setFont(new Font("osward",Font.CENTER_BASELINE,15));
	frame.add(logoname);
	//adding  account number and password field
	
	JLabel account = new JLabel("Account Number");
	account.setFont(new Font("osward",Font.PLAIN,15));
	account.setBounds(40,200,200,30);
	frame.add(account);
	
	JLabel password = new JLabel("Password");
	password.setFont(new Font("osward",Font.PLAIN,15));
	password.setBounds(40,250,200,30);
	frame.add(password);
	//adding textfields
	
	account_number = new JTextField();
	account_number.setBounds(180,200,200,30);
	frame.add(account_number);
	
	 pass = new JTextField();
	pass.setBounds(180,250,200,30);
	frame.add(pass);
	
	//add side image
	
	ImageIcon side = new ImageIcon(ClassLoader.getSystemResource("icons/business.jpg"));
	Image side2 = side.getImage().getScaledInstance(400,480, Image.SCALE_DEFAULT);
	
	ImageIcon side3 = new ImageIcon(side2);
	
	JLabel side_image = new JLabel(side3);
	side_image.setBounds(350,0,500,480);
	frame.add(side_image);
	
	//adding buttons
	
	submit = new JButton("Submit");
	submit.setBackground(Color.BLACK);
	submit.setForeground(Color.white);
	submit.setBounds(180, 300, 200, 30);
	submit.addActionListener(this);
	frame.add(submit);
	
	 forgot = new JButton("Forgot password");
	forgot.setForeground(Color.blue);
	forgot.setBounds(180,350,200,30);
	forgot.setBackground(Color.white);
	forgot.setBorderPainted(false);
	forgot.addActionListener(this);
	frame.add(forgot);
	
	new_user = new JButton("Create Account");
	new_user.setBorderPainted(false);
	new_user.setBounds(180, 390, 200, 30);
	new_user.setForeground(Color.blue);
	new_user.setBackground(Color.white);
	new_user.addActionListener(this);

	frame.add(new_user);
	
	ImageIcon wall = new ImageIcon(ClassLoader.getSystemResource("icons/back.jpg"));
	JLabel wallpaper = new JLabel(wall);
	wallpaper.setBounds(0, 0, 800,600);
	frame.add(wallpaper);


	
	

		
		
		
	}
	public static void main(String[] args) {
		LoginPage page = new LoginPage();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String a= account_number.getText();
		String b = pass.getText();
		
		if(e.getSource()==submit) {
			
			if(account_number.getText().equals("")||pass.getText().equals(""))
			{
				JOptionPane op = new JOptionPane();
				op.showMessageDialog(op, "Please enter valid password or pin");
				
					op.setBounds(200, 200, 400, 50);
						frame.add(op);
			}
			
			
			else {
				ConnectionD d = new ConnectionD();
				String pin="0000";
			try {
				PreparedStatement ps=	d.conn.prepareStatement("select Account_no,pin from Account_details where Account_no=?");
				
				ps.setString(1, account_number.getText());
				
	             ResultSet rs = ps.executeQuery();
	            
	            while(rs.next()) {
	            	 pin = rs.getString("pin");
	            }
	           
	             
	             if(pin.equals(pass.getText())) {
	            	Welcome w = new Welcome(account_number.getText());
	            	frame.setVisible(false);
	             }
	             else {
	            	 JOptionPane op = new JOptionPane();
	 				op.showMessageDialog(op, "Please enter valid password or pin");
	 				
	 					op.setBounds(200, 200, 400, 50);
	 						frame.add(op);
	             }
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
			
		}
		else if(e.getSource()==forgot) {
			
			Forgot f = new Forgot();
			
		}
		else {
			CreateAccountForm form = new CreateAccountForm();
			frame.setVisible(false);
			
		}
		
	}

}
