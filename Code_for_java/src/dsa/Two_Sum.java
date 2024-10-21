package dsa;

import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {
	
	public static int[]two_Sum(int arr[],int target){
		int low = 0 ;
		int high = arr.length-1 ;
		while(low< high) {
			
			int sum = arr[low]+ arr[high];
			if(sum == target) {
				int result []= {low, high};
				return result ;
			}
			else if (sum < target) {
				low ++;
			}
			else {
				high--;
			}
		}
	
		
		return null;
	
	}
	public static void main(String[] args) {
		
	
	int arr[] = {3,2,4};
	int target = 6;
	
	System.out.println(Arrays.toString(two_Sum(arr,target)));
	}
	
}
