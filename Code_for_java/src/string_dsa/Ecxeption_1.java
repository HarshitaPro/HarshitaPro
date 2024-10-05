package string_dsa;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ecxeption_1 {
	
	
	
	
	public static void main(String[] args) {
		
		int num1=0;
		int num2=0;
		int result=0;
		
		
		Scanner s = new Scanner(System.in);
		
		try {
		System.out.println("enter first number:");
		
		
		num1 = s.nextInt();
		System.out.println("enter second number:");
		num2 = s.nextInt();
		
		if(num2==0) {
			throw new ArithmeticException("/ by zero");
		}
		else {
			result =num1/num2;
			System.out.println(result);
		}
		
		
		}
		catch(InputMismatchException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			
			System.out.println(e);
			
		}
		
		
		
		
	    
		
		
		
		
		
		
		
	}

}
