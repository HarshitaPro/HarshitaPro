package june20ArrayQuestion;

public class ArrQue1 {

	public static void main(String[] args) {
		int arr[] = {1,2,1,9};
		int arr1[]= new int[9];
		arr1[0] = arr[0];
		arr1[1] = arr[1];
		arr1[2]= arr[2];
		arr1[3]=arr[2];
		arr1[4]= arr[3];
		arr1[5]= arr[2];
		arr1[6]=arr[1];
		arr1[7]=arr[2];
		arr1[8] = arr[3];
		for(int i:arr1) {
			System.out.print(i+" ");
		}
		
		
		}

	}


