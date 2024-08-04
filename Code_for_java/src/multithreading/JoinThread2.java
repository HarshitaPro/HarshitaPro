package multithreading;

public class JoinThread2 implements Runnable{
	static int sum;

	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
		System.out.println("inside thread 1");
		sum+=1;
		}	
	}
	
	
	public static void main(String[] args) {
		JoinThread2 jj = new JoinThread2();
		Thread t1 = new Thread(jj);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		for(int i=0; i<10; i++) {
		System.out.println("inside main thread");
		System.out.println("result ="+ sum);
		}	
	
		
	}
	
	
	

}
