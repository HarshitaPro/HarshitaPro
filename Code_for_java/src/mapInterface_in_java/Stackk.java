package mapInterface_in_java;

public class Stackk {
	
	 static final int Max=1000;
	 int top;
	 
	 int arr[] = new int[Max];
	 
	 Stackk() {
		 top = -1;
	 }
	 
	 boolean isEmpty() {
		 if(top<0) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }

	 boolean push(int x) {
		 top++;
		 if(top<Max) {
		arr[top]= x;
		System.out.println("value pushed successfully");
		 }
		 else {
			 System.out.println("Stack is overflow");
		 }
		 return top<Max;
		
	 }
	 int pop() {
			if(top<0) {
				System.out.println("stack upnder flow");
				return 0  ;
			}
			return arr[top--] ;
		}
	 
	 int peek() {
		 if(top==-1) {
			 return 0;
		 }
		 return arr[top];
	 }
	 
	
	 
	 public static void main(String[] args) {
		 Stackk s = new Stackk();
		 s.push(1);
		
		 System.out.println(s.peek());
		
		s.pop();
		 System.out.println(s.peek());
	       System.out.println();
	       
	}
	 
}
