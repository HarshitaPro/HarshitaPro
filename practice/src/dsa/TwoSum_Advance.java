package dsa;

import java.util.Arrays;

public class TwoSum_Advance {
	//Here we using binary search
	public static int[] twoSum(int[]arr,int target) {
		
		//{2,7,5,0}  
		int low=0;
		int high= arr.length-1;
		while(low<=high) {
			
			int sum = arr[low] +arr[high];
			if(sum>target) {
				high = high-1;
			}
			else if(sum==target) {
				int result[]= {low,high};
				return result;
			}
			else {
				low = low+1;
			}
		}
		
		return null;
		
	}
	public static void main(String[] args) {
		
	int [] arr= {2,0,7,8,5,4};
	int target= 6;
	System.out.println(Arrays.toString(twoSum(arr,target)));
	}

}
