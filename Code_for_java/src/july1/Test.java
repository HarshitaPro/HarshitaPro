package july1;

public class Test {

	public static void main(String[] args) {
	try {	
		
		Person p = new Person(45);
	
	Person p1 = new Person(12);//Exception
	

	}
	catch(InvalidAgeException e) {
		e.printStackTrace();
	}

}
}