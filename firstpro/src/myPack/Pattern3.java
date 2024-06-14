package myPack;

public class Pattern3 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				int sum =i+j;
				if(sum%2==0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
				
				
			}
			System.out.println();
		}
		//k pattern
		System.out.println();
		for(int i =5;i>-5;i--) {
			if(i>=1) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			}
			else {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				
			}
			
			System.out.println();
		}
		//for(int i=1;i<=5;i++) {
			//for(int j=1;j<=i;j++) {
				//System.out.print("*");
			//}
			//System.out.println();
			
		//}
		//abc pattern rectangle
		
	}

}
