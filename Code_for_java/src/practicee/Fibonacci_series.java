package practicee;
import java.util.Scanner;

public class Fibonacci_series {
	

	public static void main(String[] args) {
		int sum=0;
		
		System.out.println("enter a series size");
		Scanner s = new Scanner(System.in);
		
		int user_size= s.nextInt();
		
		int arr[] = new int[user_size];
		System.out.println("enter the numbers to series");
		
		for(int i=0; i<user_size;i++) {
			
			arr[i]= s.nextInt();
				
		}
		
		for(int i=0; i<user_size;i++) {
			
			for(int j=i+1;j<i;j--) {
				sum = arr[i]+arr[j];
				break;
				
			}
			
			
		}
		
		
		
		
		
		
		

	}

}
