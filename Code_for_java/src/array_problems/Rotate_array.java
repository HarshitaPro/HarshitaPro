package array_problems;

import java.util.Arrays;

public class Rotate_array {
	
	public static  int[] reverse(int[]arr,int start,int end) {
		
		
		
		while(start<end) {
			int temp = arr[start];
			arr[start]= arr[end];
			arr[end]= temp;
			start++;
			end--;
		}
		return arr;
		
	}  // 1 , 2, 3, 4, 5, 6,7
	   
	
	//7 6 5 4 3 2 1  // reverse == 0 , arr.length-1
	
	//5 6 7 4 3 2 1 // reverse == 0 , k-1
	//5 6 7 1 2 3 4 // reverse == k ,arr.lenghth-1
	
	public static void rotate(int[]arr, int k) {
		
		int n = arr.length;
		if(k>n) {
			k=k%n;
		}
		arr= reverse(arr, 0, n-1);
		arr= reverse(arr,0,k-1);
		arr= reverse(arr,k+1,n-1);
		System.out.println(Arrays.toString(arr));
	
		
	}
	public static void main(String[] args) {
		
		
	int[]arr= {-1,3,2};
	System.out.println(Arrays.toString(arr));
	int k=3;
	rotate(arr,k);
	
	}

}
