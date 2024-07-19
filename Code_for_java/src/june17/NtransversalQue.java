package june17;
import java.util.Scanner;

public class NtransversalQue {

	public static void main(String[] args) {
	//N transversal of matrix for 3*3 matrix
		Scanner s = new Scanner(System.in);
		
		
		
		//int[][] arr = {{1,2,3} ,{4,5,6},{7,8,9}};
		System.out.println("enter number of rows=");
		int row = s.nextInt();
		System.out.println("enter number of col=");
		int col =  s.nextInt();
		int[][] arr = new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]= s.nextInt();
			}
		}
		
	/*
		for(int i=0; i<col;i++) {
			if(i==0) {
				for(int j=row-1; j>=0;j--) {
					System.out.print(arr[j][i]);
				}
			}
			for(int j=1;j>0;j--) {
				if(i==j) {
					System.out.print(arr[i][j]);
				}
				
			}
			if(i==col-1) {
				for(int j=row-1;j>=0;j--) {
					System.out.print(arr[j][i]);
				}
			}
		}*/
		for(int i =row-1; i>=0;i--) {
			System.out.print(arr[i][0]);
		}
		 for(int i=1;i<row-1;i++) {
			 System.out.print(arr[i][1]);
		 }
		 
		 for(int i = row-1; i>=0;i--) {
			 System.out.print(arr[i][2]);
		 }
				
		

	}

}
