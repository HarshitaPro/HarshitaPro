package java_code.java_code_1;

public class Service {
	
	public static int doCalculation(int a,int b) {
		int c = a+b;
		return c;
		
	}
	
	public static  int product(int a ,int b) {
			
		return a*b;
	}
	
	public static int Divide(int a,int b) {
		return a/b;
	}
	
	public static int addAnyNum(int ...a) {
		int sum=0;
		for(int i:a) {
			sum+=i;
			
		}
		return sum;
		
	}
	
	
	}


