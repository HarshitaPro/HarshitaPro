package practicee;

public class Strong_Number {
	
	public  static int factorial(int num) {
		
		int fact=1;
		for(int i= num; i>0;i--) {
			fact = fact *i;
		}
		
		System.out.println(fact);
		return fact;
	}
	
	public  static  boolean isStrong(int num) {
		int sum=0;
		int original= num;
		
		while(num>0) {
			
			int num2 = num%10;
			num= num/10;
			sum= sum+factorial(num2);
			
		}
		return original==sum;
		
		
		
		

		
	}
	
	

	public static void main(String[] args) {
		
		System.out.println(isStrong(145));
		
		
		
	}

}
