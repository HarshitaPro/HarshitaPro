package project.hibernate2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Students_details")

public class Student {


	@Id
	private int id;
	@Transient
	private int rollno;
	@Column(name="std_name")
	private String name;
	@Column(name="Std_city")
	private String city;
	@Column(name="std_gender")
	private String gender;
	
	//default constructor

	public Student() {
		super();
	}
	//parameterized constructor
	
	public Student(int id, int rollno, String name, String city, String gender) {
		super();
		this.id = id;
		this.rollno = rollno;
		this.name = name;
		this.city = city;
		this.gender = gender;
	}
	//getter setter

	public int getId() {
		return id;
	}

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String getGender() {
		return gender;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	//to string method
	@Override
	public String toString() {
		return "Student [id=" + id + ", rollno=" + rollno + ", name=" + name + ", city=" + city + ", gender=" + gender
				+ "]";
	}

}
