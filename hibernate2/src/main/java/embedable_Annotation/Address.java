package embedable_Annotation;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	

	private String city;
	private String state;
	private int pincode;
	
	public Address() {
		super();
	}
	

	public Address(String city, String state, int pincode) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}


	public String getCity() {
		return city;
	}


	public String getState() {
		return state;
	}


	public int getPincode() {
		return pincode;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public void setState(String state) {
		this.state = state;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


}
