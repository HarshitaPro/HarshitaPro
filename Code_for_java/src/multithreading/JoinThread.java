package multithreading;

public class JoinThread {
	public static void main(String[] args) {
		Training t1 = new Training();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Placement t2 = new Placement();
		t2.start();
		
	}

}


class Training extends Thread{
	
	public void run() {
		
		for(int i =0 ; i<10;i++) {
		System.out.println("training is started");
		
		}
	}
	
}

class Placement extends Thread{
	public void run() {
		for(int i =0 ; i<10;i++) {
			System.out.println("placement is started");
			}
	}
}
