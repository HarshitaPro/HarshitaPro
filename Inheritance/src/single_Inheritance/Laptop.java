package single_Inheritance;

public class Laptop extends Device {
	private String  BatteryLife;
	
	
	String  BatteryStatus() {
		return BatteryLife;
	}

	
	public String getBatteryLife() {
		return BatteryLife;
	}

	public void setBatteryLife(String batteryLife) {
		BatteryLife = batteryLife;
	}

	

	
	//default constructor
	public Laptop() {}
	//paramaeterize constructor

	public Laptop(String brand, String model, String batteryLife ) {
		super(brand, model);
		BatteryLife = batteryLife;
		
	}
	//to string method


	@Override
	public String toString() {
		return "Laptop [BatteryStatus()=" + BatteryStatus() + ", getBatteryLife()=" + getBatteryLife() + "]";
	}


	




	
	


}
