package design_patterns;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class Logger {
	
	static Logger instance;
	 BufferedWriter bw ;
	 FileWriter writer;
	
	//private constructor
	private Logger() throws IOException {
		
	     writer = new FileWriter("C:\\myfile\\testout.txt"); 
	     System.out.println("instance created");
	    
		
	}
	//static method to call private constructor
	public static Logger getInstance() throws IOException {
		
		if(instance== null) {
			instance = new Logger(); //lazy instantiation
			
		}
		return instance;
		
		
	}
	//method to write message into file
	public void log(String msg) throws IOException {
		
		bw = new BufferedWriter(writer);
		  bw.write(msg);
		  
		   bw.flush();
		    System.out.println("success");
		    
		
	}
	

}
