package array_problems;

import java.util.Arrays;

public class Bubble_Sort {
	public static void main(String[] args) {
	int []arr = {12,8,6,4,5,33};
//		for(int i=0; i<arr.length;i++) {
//			
//			for(int j=1;j<arr.length;j++) {
//				if(arr[j-1]>arr[j]) {
//					int temp = arr[j-1];
//					arr[j-1]= arr[j];
//					arr[j]= temp;
//					
//				}
//				
//				
//			}
//		}
//		
//		System.out.println(Arrays.toString(arr));
//		
//		
		for(int i=0; i<arr.length;i++) {
			
			for(int j =i+1; j<arr.length;j++) {
				
				if(arr[i]+arr[j]==12) {
					System.out.println("two numbers are"+ arr[i]+" "+arr[j]);
				}
				
			}
		}
		
		
	}

}
