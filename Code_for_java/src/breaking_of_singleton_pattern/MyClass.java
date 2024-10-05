package breaking_of_singleton_pattern;

public class MyClass implements Cloneable{
	
	static MyClass instance;
	
	private MyClass() {
		//solution 1 to protect sigleton design pattern
		if(instance!=null) {
		throw new RuntimeException("you are trying to break the singleton design");
		}
		System.out.println("instance created");
		
	}
	
	public static MyClass getInstance() {
		//lazily instantiation
		if(instance == null) {
			
			instance = new MyClass(); 
			
		}
		return instance;
		
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		//return super.clone();  --> this may lead to break the singletone pattern
		return instance;// return the static variable so clone of object is same as object
		
	}

}
