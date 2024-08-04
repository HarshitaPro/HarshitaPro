package practicee;
import java.util.Scanner;


public class String_palindrom {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("give a String=");
		String s1= s.next();
		int num =0;
		
		
		
		
		
		
		char [] original = s1.toCharArray();
		
		
		

	  
	 if(original[0]== original[original.length-1]) {
		 System.out.println(" String is palindrome ");
	 }
	 else {
		 System.out.println(" String is not palindrome");
	 }
	  
	 
	  
	  
	  
	  
	  
	  
		
	}

}
