package multithreading;

//main class
public class Object_class_method_for_thread  {
	
	public static void main(String[] args) throws InterruptedException {
		Mythread r = new Mythread();
		
		r.start();
		synchronized(r) {
			
				r.wait();
			
		}
		System.out.println("hello");
			
		
		
		System.out.println(r.total);
		
	}
	
	
}

class Mythread extends Thread{
	int total=0;
	
	public void run() {
		synchronized (this) {
			System.out.println("child thread performing calculation");
			for(int i=0;i<=100;i++){
			total=total+i;
			}
			System.out.println("child thread giving the notification");
			this.notify();
			}
	}
}
