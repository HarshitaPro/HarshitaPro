package july1;

public class Person {
	
	private int age;
	
	public Person(int age) throws InvalidAgeException{
		if(age<18) {
			throw  new InvalidAgeException("you are not elligible");
		}
		
		else {
			System.out.println("you are eligible");
		}
	}

}
