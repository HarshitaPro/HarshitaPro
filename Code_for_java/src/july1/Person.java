package july1;

import java.util.Arrays;

public class Person {
	
	public void bb() {
		
		int[] array = {8,9,71,4,5,6};
		int n = array.length;
		for(int i =0; i<n;i++) {
			for(int j=1;j<n-i;j++) {
				
				if(array[j-1]>array[j] ){
					int temp = array[j-1];
					array[j-1]= array[j];
					array[j]=temp;
					
					//8 4 5 6 9 71
					// 8 9 4 71 5 6
					//4 9 71 8 9 6
					
				}
			}
		}
		
		System.out.println(Arrays.toString(array));
	}
	public static void main(String[] args) {
		Person p = new Person();
		p.bb();
		
	}

}
