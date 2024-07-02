package july1;
import java.util.Scanner;

public class Execpt {
	
	public static void main(String[] args) {
		
		try {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter dividend=");
		
		int a = s.nextInt();
		
		System.out.println("enter divisor=");
		int b = s.nextInt();
		int result = a/b;  // exception may be occur
		System.out.println("result="+result);
		
	
		} catch( ArithmeticException e) {
			
			System.out.println(e.getMessage());
		}
		
		System.out.println("Hello world");//it is print on console if exception is handle
	
	
	//ArrayOutOfBound Exception
		try {
	int[] arr = new int[4];
	System.out.println(arr[4]);//exception occur

	
	}catch(ArrayIndexOutOfBoundsException e1) {
		System.out.println(e1.getMessage());
		
	}
		System.out.println("rest of code");
		
		
		//number format exception occur when we convert invalid datatype into other datatype
		try {
		String s="123p";
		int i = Integer.parseInt(s);
		}catch(NumberFormatException e2) {
			e2.printStackTrace();
		}
		
		System.out.println("rest of code after number format Exception");
		
				
	}
}
	
	
	
    


	

