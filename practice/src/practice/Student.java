package practice;

public class Student {
	
	int id ;
	Address address;
	String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Student() {
		
	}
	public Student(int id, Address address, String name) {
		super();
		this.id = id;
		this.address = address;
		this.name = name;
	}
	
	
	
	

}
