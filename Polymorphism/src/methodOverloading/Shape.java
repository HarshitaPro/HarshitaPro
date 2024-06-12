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
		Shape r = new Shape();
		System.out.println("Area of rectangle="+r.CalculateArea(12,23));
		
		System.out.println("Area of circle="+r.CalculateArea(2.0));
		
		System.out.println("Area of Triangle="+r.CalculateArea(1.0,2.0));
	}
	

}
