package june20ArrayQuestion;

public class Rhombus {

	public static void main(String[] args) {
		int[][] arr= {
				{1,2,3},
				{4,5,6},
				{7,8,9}};
		 int row = arr.length;
		 int col= arr[0].length;
		 for(int i=row/2,j=col-1; i>=0 && j>=col/2; i--,j--) {
			 System.out.print(arr[i][j]+" ");
			 
		 }
		 for(int i=row/2,j=row-col; i<row&&j<col;j++,i++) {
			 
			 
			 System.out.print(arr[i][j]+" ");
		 }
		
		    
		     }
		}

	


