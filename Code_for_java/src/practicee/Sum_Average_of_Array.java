package practicee;
import java.util.Scanner;



public class Sum_Average_of_Array {
	
	static int size;
	//calculating sum of array elements
	
	public static int sum(int[] arr) {
		
		int sum=0;
		for(int i:arr) {
			sum = sum+i;
		}
		
		
		return sum;
	}
	//calculating average
	
	public static int Average(int[] arr) {
		
		int sum = sum(arr);
		int average = sum/size;
		
		
		
		return average;
	}

	
	public static void main(String[] args) {
		//taking input from user
		
		Scanner num = new Scanner(System.in); 
		System.out.print("enter size of array=");
		
		  size= num.nextInt();
		
		int[] array = new int[size];
		System.out.print("enter array elements=");
		
		for(int i=0; i<size; i++) {
			array[i]= num.nextInt();
			
			
		}
		//calling methods of sum and Average
		
		System.out.println("sum of give elements = "+ sum(array));
		System.out.println("average of give elments="+Average(array));
	}
	
	

}
