package practice;

public class Task {
	
	public static void main(String[] args) {
		int arr[] = new int[10];
		
		int num=1;
		int c =1;
		for(int i =0; i<arr.length;i++) {
			arr[i]= num*23;
			num++;
		}
		
		
		//reverse the array
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
			
		}
		
		//converting the initial array
		
		System.out.println();
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = c*17;
			c++;
		}
		//printing reverse array
		
		for(int i =arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		
		
		
	
	}
}
