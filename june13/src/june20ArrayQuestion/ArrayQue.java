package june20ArrayQuestion;

public class ArrayQue {

	public static void main(String[] args) {
	int arr[] = { 0,1,1,3,2,0,0,1,1};
	int count0=0;
	int count1=0;
	int count2=0;
	for(int i :arr) {
		if(i==0) {
			count0++;
		}
		if(i==1) {
			count1++;
			
		}
		if(i==2) {
			count2++;
		}
	}
	System.out.println("number of 0's="+count0);
	System.out.println("number of 1's="+count1);
	System.out.println("number of 2's="+count2);

	}

}
