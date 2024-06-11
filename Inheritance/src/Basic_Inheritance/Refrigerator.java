package Basic_Inheritance;

public class Refrigerator extends Appliances{
	private String star;
	private String door;
	//getter setter
	public String getStar() {
		return star;
	}
	public void setStar(String star) {
		this.star = star;
	}
	public String getDoor() {
		return door;
	}
	public void setDoor(String door) {
		this.door = door;
	}
	//parameterize constructor
	public Refrigerator(String brandName, int price, String star, String door) {
		super(brandName, price);
		this.star = star;
		this.door = door;
	}
	//default constructor
	public Refrigerator() {}
	//to String method
	@Override
	public String toString() {
		return "Refrigerator [star=" + star + ", door=" + door + ", getStar()=" + getStar() + ", getDoor()=" + getDoor()
				+ ", getBrandName()=" + getBrandName() + ", getPrice()=" + getPrice() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
	
	
	
	
	


