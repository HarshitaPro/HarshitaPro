package dsa;

public class Finding_sqrt {
	
	public static int sqrt(int x) {
		
		int low = 1;
		int high= x;
		int ans=0;
		
		if(x==0||x==1) {
			return x;
		}
		//loop 
		while(low<=high) {
			int mid = low+(high-low)/2;
			//typecasing in case of integer overflow
			if((long)mid*mid>(long)x) {
				high = mid-1;
			}
			else if(mid*mid==x) {
				return mid;
			}
			else {
				ans = mid;
				low = mid+1;
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		int root = sqrt(9);//ans ==2
		System.out.println(root);
	}

}
