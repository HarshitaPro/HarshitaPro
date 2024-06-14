package myPack;
import java.util.Scanner;

public class AdvPattern {
	public static void main(String args[]) {

	
	/*for(int i =2; i<=20;i++) {
		System.out.println("table of"+i);
		for(int j=1; j<=10;j++) {
			
			System.out.println(i*j);
		}

	}*/
	
	for(int i=1;i<=5;i++) {
		for(int j =1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println(""
			);
	
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	//rectangle
	System.out.println(""
			);
	int row=5;
	int col=5;
	
	for(int i =1; i<=5;i++) {
		for(int j =1; j<=5;j++) {
			if(i==1||i==5||j==5||j==1) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	System.out.println();
	System.out.println();
	
	for(int i =5;i>0;i--) {
		for(int j =1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
}
