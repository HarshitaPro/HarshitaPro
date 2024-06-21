package june20ArrayQuestion;
import java.util.Scanner;

public class ZigZag {
	// 4*4 matrix zigzag

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
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
		
		for(int i =row-1;i>=0;i--) {
			 System.out.print(arr[0][i]);
		}
		for(int i=0; i< row; i++) {
			System.out.print(arr[1][i]);
		}
		for(int i=row-1; i>=0;i--) {
			System.out.print(arr[2][i]);
		}
		for(int i=0; i<row; i++) {
			System.out.print(arr[3][i]);
		}
		

	}

}
