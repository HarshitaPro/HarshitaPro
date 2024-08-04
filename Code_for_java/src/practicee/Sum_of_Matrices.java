package practicee;
import java.util.Scanner;

//method to perform sum of two matrix

public class Sum_of_Matrices {
	
	
	public static void sum(Integer[][]arr1,Integer[][]arr2) {
		int row = arr1.length;
		int col = arr1[0].length;
		Integer [][] sum = new Integer[row][col];
		//calculati sum of two matrix
		
		for(int i=0; i<row; i++ ) {
			for(int j=0;j<col;j++) {
				sum[i][j]= arr1[i][j]+arr2[i][j];
				
			}
		}
		//printing sum of two matrix
		
		System.out.println("sum of 2 matrix=");
		
		for(int i=0; i<row; i++ ) {
			for(int j=0;j<col;j++) {
				System.out.print(sum[i][j]+" ");
				
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		
		//taking input of first matrix
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number of rows=");
		int  row = sc.nextInt();
		System.out.print("enter number of column=");
		int  col = sc.nextInt();
		
		Integer[][] arr1 = new Integer [row][col];
		System.out.println("enter elements of matrix");
		for(int i = 0;i<row; i++) {
			for(int j =0; j<col; j++) {
				arr1[i][j]= sc.nextInt();
				
			}
		}
		
		//taking input of 2nd matrix
		
		System.out.println("enter elements of second matrix");
		Integer[][] arr2 = new Integer[row ][col];
		for(int i = 0;i<row; i++) {
			for(int j =0; j<col; j++) {
				arr2[i][j]= sc.nextInt();
				
			}
		}
		
		//calling method that sum two matrix
		
		sum(arr1,arr2);
		
		
		
		
		
		
		
		
		
		
		
	}

}
