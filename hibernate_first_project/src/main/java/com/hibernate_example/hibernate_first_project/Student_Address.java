package com.hibernate_example.hibernate_first_project;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="student_add")
public class Student_Address {
	
	
	
@Id
	private int addID;
@Transient
	private String street;

	private String city;
	private String state;
	@Lob
     private byte[]image;
     
     public Student_Address() {
 		super();
 	}
     
     public Student_Address(int addID, String street, String city, String state, byte[] image) {
 		super();
 		this.addID = addID;
 		this.street = street;
 		this.city = city;
 		this.state = state;
 		this.image = image;
 	}

	public int getAddID() {
		return addID;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public byte[] getImage() {
		return image;
	}

	public void setAddID(int addID) {
		this.addID = addID;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
     

}
