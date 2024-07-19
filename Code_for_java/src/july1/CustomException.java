package july1;

public class CustomException extends RuntimeException{
	
	//this class throws exception if bank balance is less than 500
	
   

	public CustomException(String message) {
		super();
		System.out.println(message);
	}
     
	public CustomException() {
		super();
	}
}
