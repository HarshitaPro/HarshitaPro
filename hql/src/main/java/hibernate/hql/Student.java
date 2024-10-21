package hibernate.hql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int std_id;
	@Column(name="Std_name")
	private String name;
	private Certificate certificate;
	// default constructor
	public Student() {
		super();
	}
	//parameterized constructor
	
	public Student(int std_id, String name, Certificate certificate) {
		super();
		this.std_id = std_id;
		this.name = name;
		this.certificate = certificate;
	}
	
	
	//getter setter

	public int getStd_id() {
		return std_id;
	}

	public String getName() {
		return name;
	}

	public Certificate getCertificate() {
		return certificate;
	}

	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}

	
	
	
	
	

}
