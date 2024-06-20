package june17;

public class ArrQue5 {
	//circular transversal

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int row = arr.length;
		int col= arr[0].length;
		for(int i=0; i<row;i++) {
			if(i==0) {
				for(int j=col-1;j>=0;j--) {
					System.out.print(arr[j][i]+" ");
					
				}
				for(int j =1;j<col;j++) {
					System.out.print(arr[i][j]+" ");
					
				}
			}
			else {
				for(int j =2;j>0;j--) {
					if(i==2||j==2) {
						System.out.print(arr[i][j]+" ");
					}
				}
			}
		}
		
			
			
			
				
			
		

	}

}
