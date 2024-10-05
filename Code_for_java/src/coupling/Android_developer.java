package coupling;

public class Android_developer implements Employee {

	@Override
	public int getSalary() {
		System.out.println("Anroid developer salry:"+50000);
		return 50000;
	}
	
	public void start() {
		System.out.println("hello");
	}

	

}
