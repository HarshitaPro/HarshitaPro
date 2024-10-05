package june10;

public class Address {
	private String hno;
	private String city;
	private String state;
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public Address() {
		this.hno ="1234";
		this.city="rahatgarh";
		this.state="mp";
		
	}
	public Address(String hno, String city, String state) {
		super();
		this.hno = hno;
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", city=" + city + ", state=" + state + "]";
	}
	
	
	

}
