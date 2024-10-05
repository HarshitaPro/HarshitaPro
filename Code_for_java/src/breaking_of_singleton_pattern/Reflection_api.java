package breaking_of_singleton_pattern;
import java.lang.reflect.*;



//breaking singleton pattern using reflection api
public class Reflection_api {
	
	public static void main(String[] args)throws Exception {
		
		MyClass myclass1 = MyClass.getInstance(); //object is created
		Constructor<MyClass> cons = MyClass.class.getDeclaredConstructor();
		cons.setAccessible(true); //set constructor accessiblity to public
		MyClass myclass2 = cons.newInstance();
		
		System.out.println(myclass1.hashCode());
		System.out.println(myclass2.hashCode());
		
		
		MyEnum myenum = MyEnum.Instance;
		MyEnum myenum2 = MyEnum.Instance;
		System.out.println(myenum.hashCode());
		System.out.println(myenum2.hashCode());
		
		
		
	}

	//solution --> to check condition inside the constructor that object is there or not
	
	//solution to make a enum instead of class

}
