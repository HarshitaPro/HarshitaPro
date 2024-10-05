package Design_Patterns_Factory;

public class Shape_Factory {
	
	public static Shape createShape(String shape) {
		
		if(shape.trim().equalsIgnoreCase("circle")) {
			return new Circle();
		}
		else if(shape.trim().equalsIgnoreCase("square")) {
			return new Square();
		}
		else if(shape.trim().equalsIgnoreCase("triangle")) {
			return new Triangle();
			
		}
		else {
			return null;
		}
	}

}
