package breaking_of_singleton_pattern;

public class MutiThreading {
	
	public static void main(String[] args) {
		
		Runnable r =()->MyClass.getInstance(); //lamda expression for implement functional interface
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
		
		//mutiple thread access the getinstance method simentenously so the instance is create for each thread
		//Hence it break the single-ton pattern..
		
		//Solution--> use Syncronized Method or Synchonized Block to protect singleton class 
		
		
		
		
		
	}

}
