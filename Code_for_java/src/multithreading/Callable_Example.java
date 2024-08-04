package multithreading;
import java.util.concurrent.*;

public class Callable_Example implements  Callable {
	
	int num;
	Callable_Example(int num){
		this.num= num;
	}
	@Override
	public Object call() throws Exception {
		int sum =0;
		
		System.out.println("Thread "+Thread.currentThread().getName()+" is responsible for sum");
		for(int i=0; i<=num;i++) {
			sum+=i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		//array of callable class objects
		Callable_Example[] a = { new Callable_Example(10),
				               new Callable_Example(20),
				               new Callable_Example(300),
				               new Callable_Example(30),
				               new Callable_Example(5),
				
				
		};
	
		
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for( Callable_Example obj : a) {
			Future f = service.submit(obj);
			try {
				System.out.println(f.get());
			} catch (InterruptedException | ExecutionException e) {
				
				e.printStackTrace();
			}
		}
		service.shutdown();//
	}
	
	

}
