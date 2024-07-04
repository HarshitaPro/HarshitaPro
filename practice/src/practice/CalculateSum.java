package practice;

public class CalculateSum {
	
	int calculate(int a,int b) {
		
		return a+b;
	}
	
	double calculate(double a,double b,double c) {
		
		return a+b+c;
	}
	int calculate(int[]arr) {
		
		int sum =0;
		
		for(int i:arr) {
			sum+=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		CalculateSum cs = new CalculateSum();
		System.out.println(cs.calculate(12, 14));
		System.out.println(cs.calculate(1.2, 3.4, 2.0));
		System.out.println(cs.calculate(new int[]{1,2,3,4}));
		
	}

}
