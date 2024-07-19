package multithreading;



public class Mainn {
	
	public static void main(String[] args) {
		ThreadA a = new ThreadA();
		
		
		ThreadB b = new ThreadB();
		
		
		ThreadC c = new ThreadC();
		
		a.start();
		b.start();
		
		c.start();
		
		for(int i = 70; i<80;i++) {
			System.out.println(i);
			System.out.println("main thread");
		}
		
		
		
	}

}

class ThreadA extends Thread {
	
public 	void run() {
	for(int i=0; i<10; i++) {
		System.out.println(i);
		System.out.println("thread of class A");
	}
	
		
	}
	
}
class ThreadB extends Thread {
	
public 	void run() {
	for(int i=50; i<60; i++) {
		System.out.println(i);
		System.out.println("thread of class B");
	}
	
		
	}
	
}

class ThreadC extends Thread {
	
public 	void run() {
	for(int i=20; i<30; i++) {
		System.out.println(i);
		System.out.println("thread of class C");
	}
	
		
	}
	
}
