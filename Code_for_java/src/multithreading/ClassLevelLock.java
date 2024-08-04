package multithreading;


	class Common2{
		//class level lock
		//we also used Synchronized block for better performance
		
		public static synchronized void printName(String name){
			System.out.print("hello  ");
			
		
		
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			
		e.printStackTrace();
		}
		
		System.out.print(name+" ");
		}
	
	
	
	}

	class At1 extends Thread{
		Common2 c;
		String name;
		At1(Common2 c , String name){
			this.c = c;
			this.name= name;
		
		}
		public void run() {
			
		
		c.printName(name);
			
		}
		
		
	}

	class B1 extends Thread{
		
		Common2 c;
		String name;
		B1(Common2 c , String name){
			this.c = c;
			this.name= name;
		
		}
		public void run() {
			c.printName(name);
			
		}
		
		
	}

	public class ClassLevelLock {


	public static void main(String[] args) {
		Common2 c = new Common2();
		Common2 c1 = new Common2();
		At1 t1 = new At1(c,"Ram");
		B1 t2 = new B1(c1,"Shyam");
		t1.start();
		t2.start();

		
		
		
		

	}

}
