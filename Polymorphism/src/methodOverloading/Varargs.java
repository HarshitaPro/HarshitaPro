package methodOverloading;

public class Varargs {
	int num =0;
	
	
	void add(int a , int b) {
		System.out.println(a+b);
	}
	//it create array of arguments ... dots indicate a dynamic array
	
	void add(int ...a) {
		for(int i : a) {
			num = num+i;
		}
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		Varargs a = new Varargs();
		a.add(12,34,56,7,9,0);
	}

}
