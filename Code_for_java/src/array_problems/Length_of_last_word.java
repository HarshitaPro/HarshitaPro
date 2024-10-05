package array_problems;

public class Length_of_last_word {
	
	public static int len_of_last(String str) {
		
		String[] s= str.split(" ");
		
		return s[s.length-1].length();
	}
	
	public static int sqrt(int i) {
		
		int start =0;
		int last =i;
		int ans=0;
		while(start<=last) {
			
			int mid = start+(last-start)/2;
			
			if((long)mid*mid>(long)i) {
				last= mid-1;
				
			}
			else if(mid*mid==i) {
				return mid;
			}
			else if(mid*mid<i){
				ans=mid;
				start= mid+1;
				
			}
		}
		
		return ans;
		
	}
	
	public static void main(String[] args) {
		String temp = "luffy is still joyboy";
		int length=  len_of_last(temp);
		System.out.println("length="+length);
		
		int answer = sqrt(25);
		System.out.println("sqare root ="+answer);
	}

}
