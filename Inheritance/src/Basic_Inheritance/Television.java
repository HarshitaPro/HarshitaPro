package Basic_Inheritance;

public class Television extends Appliances {
	private String size;
	private String  loudness;
	
	void ChangeChannel() {
		System.out.println("channel has been change");
		
	}
	//getter setter

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getLoudness() {
		return loudness;
	}

	public void setLoudness(String loudness) {
		this.loudness = loudness;
	}
	//default constructor
	public Television() {}
	
	public Television(String brandName, int price, String size, String loudness) {
		super(brandName, price);
		this.size = size;
		this.loudness = loudness;
	}
	
	//parameterize constructor
	
	
	
	

}
