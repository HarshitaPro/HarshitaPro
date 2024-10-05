package array_problems;

import java.util.Arrays;

public class Selection_Sorting {
	
	public static void main(String[] args) {
		
		
		
		int arr[] = {5,4,3,9,8,0};
		int index=0;
		int n = arr.length;
		for(int i=0;i<n;i++) {
			
			index=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[index]) {
					index=j;//finding minimum index
					
					
					
					
				}
				
				
				
			}
			
			int temp = arr[index];
			arr[index]=arr[i];
			arr[i]=temp; 
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
	}

}
