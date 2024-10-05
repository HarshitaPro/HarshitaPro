package design_patterns;

public class Test  {

	public static void main(String[] args) {
		//if we call getInstance method then only single instance  is created 
	
		
	
		//if we using multithreading we can break the singleton design pattern
		//anonymus class for implementing run() of thread class
		//We have to make use synchronized block or method to protect singleton pattern
		Thread t1 = new Thread() {
			
			public void run() {
				
				Singleton_Example  s1 = Singleton_Example.getInstance();
				System.out.println(s1.show()); //9
				System.out.println(s1.show2());//10
				
			
				
			}
			
		};

		Thread t2 = new Thread() {
			
			public void run() {
				Singleton_Example s2 = Singleton_Example.getInstance();
				System.out.println(s2.show2());//11
				
			
				
			}
			
		};
		
		t1.start();
		t2.start();
		
		
		
		
		
		

	}

}
