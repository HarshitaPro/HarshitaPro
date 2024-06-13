package methodOverriding;

public class Square extends Shape {
	@Override
	
	public double CalculateArea(double length)
	{
		return length*length;
	}
}
