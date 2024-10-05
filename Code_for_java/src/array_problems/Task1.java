package array_problems;

import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {
		
		int []arr = {12,7,6,4,5,33};
		Arrays.sort(arr);
		int n = arr.length;
		int mid_point = n/2;
		int k =12;
		
		
		System.out.println(arr);
		
		for(int i = mid_point; i<n;) {
			
			if(arr[i]+arr[n-1]>k) {
				i--;
			}
			
			
			
		}
		
		
		
		
		
	}

}
