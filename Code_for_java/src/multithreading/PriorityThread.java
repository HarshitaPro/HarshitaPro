package multithreading;

public class PriorityThread implements Runnable {
	
	
	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
			String thread_name=Thread.currentThread().getName();
			if(thread_name.equals("raju")) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(thread_name + " is running " );
			
			
		}
		
		
	}
	
	public static void main(String[] args) {
		PriorityThread pt = new  PriorityThread();
		Thread thread = new Thread(pt);
		Thread thread1 = new Thread(pt);
		Thread thread2 = new Thread(pt);
		//setting name
		thread.setName("raju");
		
		thread1.setName("buntyy");
		thread2.setName("rani");
		//setting priority of each thread
		
		thread.setPriority(10); //highest priority
		
		thread1.setPriority(5);// normal priority
		thread2.setPriority(1); //lowest priority
		thread.start();
		thread1.start();
		thread2.start();
		
		
	
		
		
		
	}
	

}
