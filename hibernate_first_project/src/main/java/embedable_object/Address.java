package embedable_object;

import jakarta.persistence.Embeddable;

//referenced class 
@Embeddable
public class Address {
	
	private int hno;
	private String city;
	private String state;
	//default constructor
	public Address() {
		super();
	}
	//parameterized constructor
	public Address(int hno, String city, String state) {
		super();
		this.hno = hno;
		this.city = city;
		this.state = state;
	}

	//getter setter
	public int getHno() {
		return hno;
	}

	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	

}
