package practice;

import java.util.concurrent.*;

public class Callable_Example implements Callable{
	int num ;
	//constructor
	Callable_Example(int num){
		this.num= num;
	}
	

	@Override
	public Object call() throws Exception {
		 System.out.println("calculation done by="+ Thread.currentThread().getName());
	
		int sum=0;
		for(int i=1; i<=num; i++) {
		  sum+=i;
		 
		}
		
		return sum;
	}
	
	//main method
	public static void main(String[] args) {
		
		//creating array of callable_Example class object
		
		Callable_Example[] job = { new Callable_Example(10),
				
				                 new Callable_Example(20),
				                 new Callable_Example(30),
				                 new Callable_Example(40),
				                 
		};
		
		
		
		ExecutorService service = Executors.newFixedThreadPool(3); // create 3 threads for performing tasks
		//iterate array of objects of callable_example class
		
		for (Callable_Example obj: job) {
			Future f = service.submit(obj); //storing value of call method
			try {
				
				System.out.println(f.get());
				
			} catch (InterruptedException | ExecutionException e) {
				
				e.printStackTrace();
			} 
			
			
		}
		
		
	}
	
	
	
	
	
	
	

}
