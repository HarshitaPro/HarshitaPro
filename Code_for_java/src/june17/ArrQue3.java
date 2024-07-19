package june17;

public class ArrQue3 {

	public static void main(String[] args) {
		//transpose of matrix
		int[][] arr = {{0,0,0,0},{1,1,1,1},{2,2,2,2}};
		int[][] transpose= new int[4][3];
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				transpose[i][j]= arr[j][i];
			}
			
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(transpose[i][j]);

	}
			System.out.println();

}
	}
}
