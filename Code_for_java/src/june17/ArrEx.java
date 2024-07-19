package june17;

public class ArrEx {

	public static void main(String[] args) {
		int arr[ ]= {12,34,56,67,89};//array
		boolean flg = false;
		for(int i:arr) {
			
			if(i==83) {
				flg = true;
				System.out.println("yes");
			}
		}
		//flag value is false if element is not present in array
		if(flg==false) {
			System.out.println("no");
		}

	}

}
