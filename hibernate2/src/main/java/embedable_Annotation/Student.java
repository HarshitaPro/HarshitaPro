package embedable_Annotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_details_1")
public class Student {
	
	
	@Id
	private int id;
	@Column(name="Std_name")
	private String Name;
	@Column(name="Std_name")
	private Address address;
//default constructor
	public Student() {
		super();
	}
	//parameterized constructor
	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		Name = name;
		this.address = address;
	}
	//getter setters
	public int getId() {
		return id;
	}
	public String getName() {
		return Name;
	}
	public Address getAddress() {
		return address;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	

}
