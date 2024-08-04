package june24Abstract;

interface sayable{
	public void sleep();
}

public class AnonymusClassExample {
	
	public void eat () {
		System.out.println("harshita chourasiya");
		
	}
	
	public static void main(String[] args) {
		//anonymus class
		sayable s = new sayable() {
			public void sleep() {
				System.out.println("hello");
			}
			
		};
		
		s.sleep();
		
	}

	
	
		
	}
	


