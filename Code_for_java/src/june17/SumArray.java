package june17;
public class SumArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,6,7};
		int target =13;
		int count=0;
		for(int i =1; i<arr.length;i++) {
			   
			if(arr[count]+arr[i]==target) {
				System.out.println(arr[count]+" "+arr[i]);
				break;
			}
			else {
				count++;
			}
			
		}

	}

}
