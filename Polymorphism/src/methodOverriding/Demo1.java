package methodOverriding;

public class Demo1 {

	public static void main(String[] args) {
		Square s = new Square();
		System.out.println("area of square="+s.CalculateArea(12));
		Circle c =new Circle();
		System.out.println("area of circle="+ c.CalculateArea(1.0));
		Shape shape = new Shape();
		System.out.println(shape.CalculateArea(0.0));

	}

}
