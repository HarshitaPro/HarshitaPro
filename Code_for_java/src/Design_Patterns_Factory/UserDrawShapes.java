package Design_Patterns_Factory;

public class UserDrawShapes {

	public static void main(String[] args) {
		
		Shape_Factory shape = new Shape_Factory();
		Shape c = shape.createShape("circle");
		c.draw(); //calling method of circle class
		Shape t = shape.createShape("triangle");
		t.draw(); //calling method of triangle class
		Shape s = shape.createShape("square");
		s.draw();//calling method of square class
	}

}
