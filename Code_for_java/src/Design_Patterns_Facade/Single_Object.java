package Design_Patterns_Facade;

public class Single_Object {
	
	static Single_Object  instance;
	
	
	private Single_Object() {
			
	}
	
	
	public  static Single_Object  getInstance() {
		if(instance ==null) {
			instance = new Single_Object();
		}
		
		return instance;
		
		
		
	}

}
