package june9;

public class Adress {
	private String city;
	private String hno;
	
	/*public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}*/
	@Override
	public String toString() {
		return "Adress [city=" + city + ", hno=" + hno + "]";
	}
	public Adress(String city, String hno) {
		super();
		this.city = city;
		this.hno = hno;
	}
	
	

}
