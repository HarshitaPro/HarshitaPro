package array_problems;

public class Remove_element {
	
	
	public static int remove(int []arr,int k) {
		
		int len = arr.length;
		int count=0;
		for(int i =0;i<len;i++) {
			if(arr[i]!=k) {
				arr[count]= arr[i];
				count++;
			}
		}
		return count;
	}		
			
	public static void main(String[] args) {
		int[ ] arr= {3,2,2,3,0,8,2};
		
		int a = remove(arr,3);
		System.out.println(a);
		
		}
	}


