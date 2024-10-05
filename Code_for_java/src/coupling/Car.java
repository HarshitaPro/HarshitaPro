package coupling;


public class Car {
	
	public Enginee engine;
	String body_type;
	
	
	
   public Car(String body_type, Enginee engine) {
	   
	   
	  this.body_type = body_type;
	  this.engine = engine;
	   
   }
   
   public  void start() {
	   
	   engine.show();
	   System.out.println("Now you can start ");
   }
   

	
	

}
