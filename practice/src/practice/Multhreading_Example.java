package practice;


class Common{
	
	//using synchronize keyword so one thread use this method at a time
	public synchronized void fun1(String s) {
		System.out.print("welcome  ");
		//calling sleep method of thread class
		try {
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.print(s);
	}
}
class Thread1 extends Thread{
	Common c;
	String s;
	
	//parameterize constructor 
	Thread1(Common c,String s){
		this.c= c;
		this.s = s;
	}
	
	@Override
	public void run() {
		c.fun1(s);
		
		
	}	
	
}
class Thread2 extends Thread{
	Common c;
	String s;
	
	//parameterize constructor 
	Thread2(Common c,String s){
		this.c= c;
		this.s = s;
	}
	
	@Override
	public void run() {
		c.fun1(s);
		
		
	}	
	
}





public class Multhreading_Example {
	
	public static void main(String[] args) {
		//creating object of common class
		Common c = new Common();
		Thread1 t1 = new Thread1(c,"Harshita");//passing object of common class and string 
		Thread2 t2 = new Thread2(c,"harsh");
		//calling start
		t1.start();
		t2.start();
		
	}

}
