package Design_Patterns_Facade;

public class Movie_Arrangement {
	//Facade layer
	Light_of_Room lor;
	Sound_System ss;
	Television tv;

	
	public Movie_Arrangement(Light_of_Room lor, Sound_System ss, Television tv) {
		super();
		this.lor = lor;
		this.ss = ss;
		this.tv = tv;
	}
	
	public void Watch() {
		lor.Light_dim();
		tv.TurnOn();
		ss.turnOn_Sound();
	}

	
	public void Stop_Watching() {
		lor.Light_On();
		tv.TurnOff();
		ss.turnOff_Sound();
	}
}
