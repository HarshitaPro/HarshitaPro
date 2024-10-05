package Design_Patterns_Facade;

public class User {

	public static void main(String[] args) {
		
		Television tv = new Television();
		Sound_System ss = new Sound_System();
		Light_of_Room lof = new Light_of_Room();
		
		Movie_Arrangement ma = new Movie_Arrangement(lof,ss,tv); //facade layer object
		ma.Watch(); //calling method of Facade
		ma.Stop_Watching();
	}

}
