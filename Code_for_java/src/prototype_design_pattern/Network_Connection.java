package prototype_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class Network_Connection implements Cloneable{
	
	
	private String IP;
	private String msg;
	private List<String>domain = new ArrayList<>();
	
	
	
	
	
	
	//getter setter 
	public String getIP() {
		return IP;
	}
	public String getMsg() {
		return msg;
	}

	public void setIP(String iP) {
		IP = iP;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	//constructor
	
	public Network_Connection(String iP, String msg) {
		super();
		IP = iP;
		this.msg = msg;
	}
	
	//default constructor
	public Network_Connection() {
		
	  
	}
	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Network_Connection nc = new Network_Connection();
		nc.setIP(this.IP);
		nc.setMsg(this.msg);
		
		
		
		return super.clone(); //shallow clonning
	}

	
	
}
