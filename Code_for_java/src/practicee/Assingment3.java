package practicee;

import java.util.Scanner;

@FunctionalInterface
interface Function_interface{
	
	public int Square(int x);
	
	
}
//class in which static method is defined
class Demo{
public static int square(int x) {
		
		return x*x;
						
	}
}

public class Assingment3 {
	
	
	
	public static void main(String[] args) {
		//user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int user_input= sc.nextInt();
		
		Function_interface fun = Demo::square;   //using method refernce 
		
		System.out.println("square of given number:"+fun.Square(user_input));
		
		
		
		
	}

}
