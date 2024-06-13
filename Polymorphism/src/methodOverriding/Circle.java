package methodOverriding;

public class Circle extends Shape{
	@Override
	
	public double CalculateArea(double radius) {
		return 3.14*radius*radius;
	}

}
