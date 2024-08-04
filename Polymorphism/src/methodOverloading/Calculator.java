package methodOverloading;

public class Calculator {
	
	
	public int add(int a,int b) {
		return a+b;
		
	}
	//changing return type 
	public double add(double a,double b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		System.out.println("sum of 2 and 3 ="+c.add(2,3)); //calling method which take two integer parameters
		System.out.println("sum of 2.4 and 3.45= "+c.add(2.4,3.45));// calling method which take two doubles as parameter
		System.out.println("sumof 2,3,4= "+c.add(12, 13,34));//calling method which take three integers as parameter
		
	
		
	}

}
