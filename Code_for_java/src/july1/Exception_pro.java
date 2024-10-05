package july1;

public class Exception_pro {
	
	public static void divide(){
		
		int x = 2/0;
		System.out.println(x);
		
		
	}
	
	public static void main(String[] args) {
	try {
		divide();
		
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	}
	
	}
}
