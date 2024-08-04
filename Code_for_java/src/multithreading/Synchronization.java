package multithreading;


class Common{
	//object level lock---> if thread of same object try to accesss this method so they can exceute same 
	//method simentenously
	
	public synchronized void printName(String name){
		System.out.print("hello  ");
		
	
	
	try {
		Thread.sleep(1000);
	}catch(Exception e) {
	e.printStackTrace();
	}
	
	System.out.print(name+" ");
	}
}

class At extends Thread{
	Common c;
	String name;
	At(Common c , String name){
		this.c = c;
		this.name= name;
	
	}
	public void run() {
		
	
	c.printName(name);
		
	}
	
	
}

class B extends Thread{
	
	Common c;
	String name;
	B(Common c , String name){
		this.c = c;
		this.name= name;
	
	}
	public void run() {
		c.printName(name);
		
	}
	
	
}



public class Synchronization{
	
	

	public static void main(String[] args) {
		Common c = new Common();
		At t1 = new At(c,"Ram");//object level lock 
		B t2 = new B(c,"Shyam");
		t1.start();
		t2.start();

	}

}
