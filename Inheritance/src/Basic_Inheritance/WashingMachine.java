package Basic_Inheritance;

public class WashingMachine extends Appliances{
	private String type;
	private String size;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	//parameterize constructor
	public WashingMachine(String brandName, int price, String type, String size) {
		super(brandName, price);
		this.type = type;
		this.size = size;
	}
	//default constructor
	public WashingMachine() {}
	@Override
	public String toString() {
		return "WashingMachine [type=" + type + ", size=" + size + ", getType()=" + getType() + ", getSize()="
				+ getSize() + ", getBrandName()=" + getBrandName() + ", getPrice()=" + getPrice() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	//to string method
	

}
