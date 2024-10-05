package array_problems;

public class Recursion {
	
	
	
	//problem-1 : print numbers upto 1 
	
	public static void print(int num) {
		
		if(num>0) {
			print(num-1);
			System.out.println(num + " ");
		}
		
	}
	
	//problem-2
	
	public static int sum_of_digit(int num) {
		if(num==0) {
			return 0;
		}
		else {
		
		int n = num%10;
		num = num/10;
		return n+sum_of_digit(num);
		}
	}
	
	//fibonacci series
	
	static int num1= 0;
	static int num2 =1;
	
	
	public static void fibonacci_series(int N) {
		/**int num1 =0;
		int num2 = 1;
		System.out.println("fibonaci series:");
		for(int i=0; i<N;i++) {
			System.out.print(num1 +" ");
			int num3 = num1 + num2;
			num1= num2;
			num2= num3;
		}**/
		
	
		if(N>0) {
		System.out.print(num1 +" ");
		int num3 = num1+num2;
		num1 = num2;
		num2 = num3;
		
		 fibonacci_series(N-1);
		}
		  
		
		
		
	}
	
	//factorial of a number
			public static int factorial(int num) {
				if(num==0) {
					return 1;
					
				}
				else {
					return num*factorial(num-1);
				}
				
			}
	
	public static void main(String[] args) {
		
		print(10);
		System.out.println();
		System.out.println("sum of number:"+sum_of_digit(1234));
		fibonacci_series(10);
	   int fact =  factorial(4);
	   System.out.println("factorial= "+fact);
		
		
	}

}
