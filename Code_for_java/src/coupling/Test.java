package coupling;

public class Test {

	public static void main(String[] args) {
		
		ElectricEngine e = new ElectricEngine();
		DiselEngine d = new DiselEngine();
		
		Car c = new Car("metal", e ) ;
		c.start();
		Car c2 = new Car("steel", d);
		c.start();
			
		
	}
}
