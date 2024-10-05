package practicee;
import java.util.InputMismatchException;
import java.util.Scanner;


public class MismatchException_Example {
	
	public static void main(String[] args) {
		
	
	
	try {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number=");
		int user_input = sc.nextInt();
		
	}catch(InputMismatchException e) {
		
		//e.printStackTrace();
		System.out.println(e);
		System.out.println("please enter a valid integer");
		
	}
	}

}
