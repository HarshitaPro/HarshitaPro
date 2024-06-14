package myPack;

public class HelloWorld {
	public static void main(String args[] ){
	for(int i=1; i<=5;i++) {
		for(int j=1; j<=i;j++) {
			System.out.print("*");
		}
		//spaces
		int space = 2*(5-i);
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
		}
		//2nd part
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	 //lower part
	for(int i=5;i>0;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		int space = 2*(5-i);
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
		}
		//2nd part
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	//printing rhombus
	System.out.println();
	System.out.println();
	
	for(int i=1; i<=5;i++) {
		int space = 5-i;
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
		}
		
		for(int j=1;j<=5;j++) {
			System.out.print("*");
		}
		
			
		
		System.out.println();
			
	}
	
	System.out.println();
	System.out.println();
	//number pyramid
	for(int i=1; i<=5;i++) {
		;
		for(int j=1;j<=5-i;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	System.out.println();
	System.out.println();
	//palindrome pyramid
    for(int i=1;i<=5;i++) {
    	
    	for(int j=1;j<=5-i;j++) {
    		System.out.print(" ");
    	}
    	for(int j=i;j>0;j--) {
    		System.out.print(j+"");
    	}
    	for(int j=2;j<=i;j++) {
    		System.out.print(j+"");
    	}
    	System.out.println();
    }
    //simple  diamond
    System.out.println();
    System.out.println();
    
    for(int i=1;i<=5;i++) {
    	for(int j=1;j<=5-i;j++) {
    		System.out.print(" ");
    	}
    	for(int j=1;j<=i;j++) {
    		System.out.print("* ");
    	}
    	System.out.println();
    }
    	for(int i=5;i>0;i--) {
    		
    		for(int a=1;a<=5-i;a++) {
    			System.out.print(" ");
    		}
    		for(int j=1;j<=i;j++) {
    			System.out.print("* ");
    		}
    		System.out.println();
    	}
    }
		
	}


