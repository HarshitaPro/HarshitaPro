package practice_question;

public class Two_sum {
	
	
	public static void check(int[]arr,int target) {
		
		int size = arr.length;
		
		for(int i =0; i<size;i++) {
			
			for(int j =i+1;j<size;j++) {
				
				if(arr[i]+arr[j]==target) {
					System.out.println("Numbers sum equal to target is:"+arr[i]+" "+arr[j]);
				}
				
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		int target = 9;
		int[]arr = {1,5,4};
		check(arr,target);
		
	}

}
