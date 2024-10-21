package dsa;

import java.util.Arrays;

public class TwoSum_beginnerSolution {
	
	//by using inner loops we can find the sum of two numbers that matche to target
	public static int[] twoSum(int[]arr,int target) {
		
		//{2,7.8,11}
		//target==9
		int[]result = new int[2];
		for(int i =0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					result[0]=i;
					result[1]=j;
					
				}
			}
		}
		
		return result;
		

		
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2,7,8,5};
		int target= 7;
	System.out.println(Arrays.toString(twoSum(arr,target)));
		
	}

}
