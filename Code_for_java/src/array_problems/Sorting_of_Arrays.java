package array_problems;

public class Sorting_of_Arrays {
	//bubble sort
	//stable sorting technique
	
	public static void main(String[] args) {
		
		int []arr= {12,56,8,9,10};
		int n= arr.length;
		int count =0;
		boolean flag =true;
		for(int i =0; i<n;i++) {
			
			for(int j =1;j<n-i;j++) {
				
				if(arr[j-1]>arr[j]) {
					count++;
					int temp = arr[j-1];
					arr[j-1]= arr[j];
					  arr[j]= temp;
					  flag= false;
					}
				
			}
			
			if(flag==true) {
				break;
			}
		}
		
		
			
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
			System.out.println(count);
		
		
	}
	

}
