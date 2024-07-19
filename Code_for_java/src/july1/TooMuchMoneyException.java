package july1;
//checked exception 
//it is know to us when we call the method that throw checked exception
//if a method throws this exception then it is expicity define with throws keyword with method signature

public class TooMuchMoneyException extends Exception {

	public TooMuchMoneyException() {
		super();
	}
	
	public TooMuchMoneyException(String message) {
		super(message);
	}


}
