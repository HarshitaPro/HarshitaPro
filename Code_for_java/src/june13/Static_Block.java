package june13;

public class Static_Block {
	//static block is call when class is loaded into JVM by Classloader
	//static block is call before main method
	static {
		System.out.println("static block");
	}
	//instance block is when object of class is created 
	//it is simply created by putting statement inside curly braces
	{
		System.out.println("instance block");
	}
	
	public static void main(String[] args) {
		Static_Block st = new Static_Block();
		System.out.println("main block");
	}

}
