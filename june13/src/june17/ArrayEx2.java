package june17;

import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
		int arr[]= {4,7,1,75,31,72};
	Arrays.sort(arr);
	/*	int max = arr[0];
		int min=arr[0];
		
		for(int i:arr) {
			if(i>max) {
				max=i;
			}
			if(i<min) {
				min=i;
			}
			
		}*/
		System.out.println("max value is"+ arr[5]);
		System.out.println("min value is"+arr[0]);
		
	}

}
