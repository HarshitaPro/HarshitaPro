package practice;

public class ArrayOutOfBoundsExample {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		try {
		for(int i =0; i<5;i++) {
			System.out.println(arr[i]);//exception
		}
		}catch(ArrayIndexOutOfBoundsException e) {
		System.exit(0);
			
		}
		finally {
			System.out.println("always executed");//here finally block is not executed
		}
		
		

	}

}
