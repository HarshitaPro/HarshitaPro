package june13;
//static variable  refers to common property for all instance of class
//static variable store in method area/class area rather than heap memory


public class Counter {
	
	
	 static int   count1=0;
	
	public Counter()
	{
		
		count1++;
		System.out.println(count1);
	}
	public static void main(String[] args) {
		
		Counter c = new Counter();
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		
		Counter c3= new Counter();
		Counter c4 = new Counter();
		Counter c5 = new Counter();
	}

}
