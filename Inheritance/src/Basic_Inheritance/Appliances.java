package Basic_Inheritance;

public class Appliances {
	private String brandName;
	private int price;
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//parameterize constructor
	public Appliances(String brandName, int price) {
		super();
		this.brandName = brandName;
		this.price = price;
	}
	//default caonstructor
	public Appliances() {}
	//toString method
	@Override
	public String toString() {
		return "Appliances [brandName=" + brandName + ", price=" + price + "]";
	}

	
	

}
