package this_keyword;

public class Method_Argument {
	
	void display(Method_Argument m) {
		System.out.println("hello i am first method");
	}
	
	void show() {
		display(this);
		System.out.println("hello i am second method");
		
	}
	

}
