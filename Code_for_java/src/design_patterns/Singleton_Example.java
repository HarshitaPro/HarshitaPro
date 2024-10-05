package design_patterns;

public class Singleton_Example {
	static Singleton_Example instance = null;
	int num;
	
	
	private Singleton_Example() {
		
		
	}
	
	public static Singleton_Example getInstance() {
		
		
		
		synchronized(Singleton_Example.class) {
		
		if(instance==null) {
			System.out.println("instance is created");
			
			instance =new Singleton_Example();
		}	
			
		}
		return instance;
		
		
		
	}
	
	public int  show() {
		  num = 9;
		return num;
		
		
		
	}
	
	public int show2() {
		
		return ++num;
	}
	
	
	

}
	
	

	

