package practicee;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		//taking input of operators 
		
		Scanner value = new Scanner(System.in);
		System.out.println("enter the operatot--> + , - , *, /");
		
		String user_value = value.next();
		
		//taking input of operands
		
		 Scanner operand = new Scanner(System.in);
		  System.out.print("enter the first number=" );
		  int x = operand.nextInt();
		  System.out.print("enter the second number=");
		  int y = operand.nextInt();
		  
		  //using if-else bridge
		  if(user_value.equals("+")) {
			  
			 int z =x+y;
			  System.out.println("sum of given values="+z);
			  
		  }
		  
		  else if(user_value.equals("-")) {
			  int z =x-y;
			  System.out.println("substraction of given value ="+z);
		  }
		  
		  else if(user_value.equals("*")) {
			  int z = x*y;
			  System.out.println("multiplication of given numbers ="+z);
			  
		  }
		  else if(user_value.equals("/")) {
			  try {
			  int z = x/y; //runtime exception --/0
			  System.out.println("division of given numbers="+z);
				 
			  
			  }
			  catch(ArithmeticException e) {
				  e.printStackTrace();			  }
			   
		  }
		  else {
		  System.out.println("give appropiate operator to perform operation");
	  }
		  
		  
		
	}
}
		  
		
		
		
		
		
		

	


