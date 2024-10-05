package practice_question;


public class Quick_sort {
	
	public static void quick_Sort(int [] arr, int low, int high) {
		
		if(low<high) {
			int partition = partition(arr,low,high);
			
			quick_Sort(arr,low,partition-1);
			quick_Sort(arr,partition+1,high);
			
		}
		
	}
	
	public static int partition(int arr[],int low,int high) {
		
		int pivot= arr[high];
		int temp = low-1;
		
		for(int j =low; j<high;j++) {
			
			if(arr[j]<pivot) {
				
				temp++;
				int i =arr[temp];
				arr[temp]= arr[j];
				arr[j]= i;
				
			}
		}
		
		temp++;
		
		int i =arr[temp];
		arr[temp]= arr[high];
		arr[high]= i;
		
		return temp;
		
		
		
	}
	
	public static void main(String[] args) {
		int [] arr= {4,3,2,1};
		quick_Sort(arr,0,3);
		for(int i:arr) {
			System.out.println(i);
		}
	}

}
