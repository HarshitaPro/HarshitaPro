package june17;

public class RowArr {

	public static void main(String[] args) {
		int[][]arr = {{2,3,5},{6,7,2},{2,4,8}};
		
		for(int i =0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(arr[i][j]%2==0) {
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}

	}

}
