package breaking_of_singleton_pattern;

//if our sigletone class implements cloneable interface then we can easily break it

public class Clonning {
	
	public static void main(String[] args) throws CloneNotSupportedException  {
		MyClass my = MyClass.getInstance();
		System.out.println(my.hashCode());//instance is created
		
		MyClass my2 =(MyClass)my.clone();
		System.out.println(my2.hashCode()); //clone is created of object
		
	
		
	}

}
