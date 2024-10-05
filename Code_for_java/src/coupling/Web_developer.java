package coupling;

public class Web_developer implements Employee{

	@Override
	public int getSalary() {
		System.out.println("Web Developer salary:"+40000);
		return 40000;
	}

}
