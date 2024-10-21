package dsa;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_betterSolution {
	
	public static int[] twoSum(int arr[],int target) {
		
		HashMap<Integer,Integer>hm = new HashMap<>();
		
		
		for(int i=0;i<arr.length;i++) {
			int req_num = target-arr[i];
			
			if(hm.containsKey(req_num)) {
				
			int [] result = {hm.get(req_num),i};
			return result;
			}
			hm.put(arr[i], i);
		}
		
		return null;
		
	}
	
	public static void main(String[] args) {
		int arr[]= {2,6,0,7};
		int target= 9;
		System.out.println(Arrays.toString(twoSum(arr,target)));
	}

}
