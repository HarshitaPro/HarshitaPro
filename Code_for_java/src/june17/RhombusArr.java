package june17;

public class RhombusArr {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3} ,{4,5,6},{7,8,9}};
		int row = arr.length;
		int col = arr[0].length;
		
			System.out.print(arr[row-row][row/2]);
			System.out.print(arr[row/2][row-row]);
			System.out.print(arr[row-1][row/2]);
			System.out.print(arr[row/2][row-1]);
		
	

	}

}
