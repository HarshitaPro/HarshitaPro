package practice_question;

public class Question_1 {
	
	//Bubble sort
	
	public static void bubblesort(int arr[]) {
		int size = arr.length;
		//outer loop
		for(int i =0; i <size;i++) {
			//inner loop
			for(int j = 0; j <size-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		int [] arr= {4,3,2,1};
		bubblesort(arr);
		for(int i :arr) {
			System.out.println(i);
		}
		
		
	}

}
