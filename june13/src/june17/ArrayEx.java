package june17;

public class ArrayEx {

	public static void main(String[] args) {
		
		int arr[]= {1,2,5,8,7,9,4};
		int k =13;
		for(int i=0; i<arr.length;i++) {
			for(int j= i+1; j<arr.length;j++) {
				if(arr[i]+arr[j]==k) {
					System.out.println(arr[i]+" "+ arr[j]);
					break;
				}
			}
		}
			
		
		
			
				
		
		
			
			
			
		}

	}


