package methodOverriding_access_modifier;

public class Demo {

	public static void main(String[] args) {
	Car c = new Car();
	c.StartEngine();

	}
	//here we getting error 
	//Because of private access specifier 
	//private access specifier do not allow any subclass to override any private method

}
