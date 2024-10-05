package array_problems;

import java.util.Arrays;

public class Max_Sum {

	public static void main(String[] args) {
		int arr[]= {12,7,6,4, 91, 23  , 45 , 92 ,90,5,33};
		int max=0;
		int n = arr.length;
		int num1 = 0;
		int num2 = 0;
		int num3=0;
		Arrays.sort(arr);
		
		for(int i=0; i<n-3; i++) {
			
			
			if(arr[i+1]-arr[i]==1 && arr[i+2]-arr[i+1]==1) {
				System.out.println(arr[i]);
				num1 = arr[i];
				num2 = arr[i+1];
				num3= arr[i+2];
				
			}
		}
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		
		System.out.println(num1+num2+num3);
		

	}
	
}
