package design_patterns;

import java.io.IOException;

public class Demo {
	
	public static void main(String[] args) throws IOException {
		
		Logger l1 = Logger.getInstance();// creating object of Logger class
		
		Logger l2 = Logger.getInstance(); //creating another object
		
		l1.log("hello  \n"); //calling log method
		
		l2.log("world");
		
		
	}

}

