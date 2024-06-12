package methodOverloading;

public class Shape {
	public int CalculateArea(int length,int breath) {
		return length*breath;
	}
	
	public double CalculateArea(double radius) {
		return 3.14*radius*radius;
	}
	public double CalculateArea(double base,double height) {
		return 0.5 *base*height; 
	}
	public static void main(String[] args) {
		Shape rectangle = new Shape();
		System.out.println("Area of rectangle="+rectangle.CalculateArea(12,23));
		Shape circle= new Shape();
		System.out.println("Area of circle="+circle.CalculateArea(2.0));
		Shape triangle = new Shape();
		System.out.println("Area of Triangle="+triangle.CalculateArea(1.0,2.0));
	}
	

}
