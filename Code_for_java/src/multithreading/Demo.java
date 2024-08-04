package multithreading;

public class Demo {

	public static void main(String[] args) {
		
		DemonThreadd dd = new DemonThreadd();
		dd.setDaemon(true);
		dd.start();
		System.out.println("I am main thread");
		
				

	}

}
//demon thread call when main thread is run 
//if main thread does not anything to execute then jvm automatically 
//terminate the demon thread