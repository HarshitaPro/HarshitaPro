package Sorting_algo;

import java.util.Arrays;

public class Binary_Search {
	//binary search
	
	
	//traditional method to search element ====>linear search
	public static int search(int[]arr,int k) {
		int count =0;
		for(int i :arr) {
			
			if(i==k) {
				return count;
			}
	         count++;
		}
		return -1;
	}
	
	//by binary search
	
	
	public static int binarySearch(int[]arr,int k) {
		//finding midle 
		int low = 0;
		int high = arr.length-1;
		
		
		int count =0;
		while(low<=high)
			{
			
			int mid = low+(high-low)/2;	
			count++;
			
		if(arr[mid]==k) {
			return mid;
		}
		if(arr[mid]>k) {
			high = mid-1;
		}
		if(arr[mid]<k) {
			low = mid+1;
		}
		
		}
		System.out.println(count);
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {2,4,6,8,0,4,6,3,5,86,9,43,55,24};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int k =86;
		int index = binarySearch(arr,k);
		System.out.println("index:"+index);
		
	}

}
