package june13;

public class Counter1 {
	
	static int a=0;
	public static void count() {
		a++;
	}
	public static void display() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		 Counter1.count();
		 Counter1.count();
		 Counter1.count();
		 Counter1.count();
		 Counter1.count();
		 Counter1.display();
	}
	//this value becomes five because static variable is created when the class is loaded into 
	//jvm and destroy when program is fully executed

}
