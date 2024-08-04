package multithreading;

class Common3{
	public void fun(String name) {
		synchronized(this) 
		{
		
		System.out.print("hello  ");
		
		try {
			
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		System.out.print(name);
	}
		
		
	}
}

class Thread_A extends Thread{
	Common3 c;
	String name;
	Thread_A(Common3 c  , String name){
		this.c = c;
		this.name= name;
		
		
	}
	public void run() {
		c.fun(name);
	}
}

class Thread_B extends Thread{
	Common3 c;
	String name;
	Thread_B(Common3 c  , String name){
		this.c = c;
		this.name= name;
		
		
	}
	public void run() {
		c.fun(name);
	}
}

public class Synchronized_block {
	public static void main(String[] args) {
		Common3 c1 = new Common3();
		Thread_A t1 = new Thread_A(c1,"Ram");
		Thread_B t2 = new Thread_B(c1,"Shyam");
		t1.start();
		
		t2.start();
		
	}
	
	

}
