package practicee;
import java.util.Scanner;

public class Sorted_Array {

	public static void main(String[] args) {
		
		int sort=0;
		
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int [] array = new int[size];
		
		for(int i=0; i<size; i++) {
			array[i] = s.nextInt();
			
		}
		
		//sorting array in ascending order
         
		for(int i=0; i<size; i++) {
			
			for(int j=i+1; j<size;j++) {
				
				if(array[i]>array[j]) {
					sort = array[i];
					array[i ]= array[j];
					array[j]= sort;
					
				}
				
			}
			
		}
		

          for(int i : array) {
        	  System.out.print(i+" ");
          }
	}

}
