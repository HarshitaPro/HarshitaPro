package single_Inheritance;

public class Device {
	
	protected String brand;
	protected String model;
	
	void turnOff() {
		System.out.println("Device is Turn Off");
	}
	void turnOn() {
		System.out.println("Device is Turn On");
	}
	//getter setter
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	//default constructor
	Device(){
		this.brand="samsung";
		this.model="4th generation model";
	}
	//Paramterize constructor
	public Device(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}
	//to string
	@Override
	public String toString() {
		return "Device [brand=" + brand + ", model=" + model + ", getBrand()=" + getBrand() + ", getModel()="
				+ getModel() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
