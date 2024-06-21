package june17;

public class NReverseArray {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3} ,{4,5,6},{7,8,9}};
		int row = arr.length;
		int col = arr[0].length;
	
		/*for(int i=0; i<col;i++) {
			if(i==0) {
				for(int j=0; j<row;j++) {
					System.out.print(arr[j][i]);
				}
			}
			for(int j=1;j>0;j--) {
				if(i==j) {
					System.out.print(arr[i][j]);
				}
				
			}
			if(i==col-1) {
				for(int j=0;j<row;j++) {
					System.out.print(arr[j][i]);
				}
			}*/
		for(int i =0; i<row;i++) {
			System.out.print(arr[i][0]);
		}
		 for(int i=1;i<row-1;i++) {
			 System.out.print(arr[i][1]);
		 }
		 
		 for(int i = 0; i<row;i++) {
			 System.out.print(arr[i][2]);
		 }
				
		
		}
				
		
		

	}


