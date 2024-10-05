package Sorting_algo;

import java.util.Arrays;

public class Interpolation_Search {
	
	public static int interpolation_search(int arr[],int low,int high,int k) {
		
		int position;
		
		while(low<=high&& k>=arr[low]&& k<=arr[high]) {
			
			 position = low +((high-low)*(k-arr[low]))/arr[high]-arr[low];
	 
			
			if(arr[position]==k) {
				return position;
				
			}
			
			if(arr[position]<k) {
				low = position+1;
			}
			
			if(arr[position]>k) {
				high = position-1;
			}
			
		}
		
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2,4,6,8,0,4,6,3,5,86,9,43,55,24};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int k =86;
		int high = arr.length-1;
		int index = interpolation_search(arr,0,high,k);
		System.out.println("index:"+index);
		
	}

}
