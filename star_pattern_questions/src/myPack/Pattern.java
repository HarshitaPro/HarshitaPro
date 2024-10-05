package myPack;

public class Pattern {
	

	public static void main(String[] args) {
		
	//printing simple pattern
		for(int i =1; i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println(""
				+ ""
				+ "");

		//half pyramid pattern
		for(int i=1; i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println(""
				+ ""
				+ "");

		//180 degree rotated pyramid having 5 rows
		int n=5;
		for(int i = 1; i<=n; i++) {
			for(int a=1;a<=n-i;a++) {
				System.out.print(" ");
			}
			for(int j =1;j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println(""
				+ ""
				+ "");


		//print Inverse pyramid
		for(int i=5; i>0; i--) {
			for(int j =1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		System.out.println(""
				+ ""
				+ "");

		//print a hollow rectangle
		int row =4;
		int col=5;
		for(int i=1; i<=row;i++) {
			for(int j=1;j<=col;j++) {
				if(i==1||j==1||i==row||j==col) {
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i = 5;i>0;i--) {
			for(int j =1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int j = 1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=5;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	System.out.println();
	
	for(int i=5;i>0;i--) {
		for(int j=1;j<=5;j++) {
			if(j<=5-i) {
			System.out.print(" ");
		}
			else {
			System.out.print("*");
		
			}
		
	}
		System.out.println();
		
	}
	System.out.println();
	for(int i =5;i>0;i--) {
		for(int j=1;j<=5-i;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	}
}


