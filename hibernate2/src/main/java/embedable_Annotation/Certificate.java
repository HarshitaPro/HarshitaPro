package embedable_Annotation;

import javax.persistence.Embeddable;

@Embeddable

public class Certificate {
	
	private String duration;
	private String course;
	
	//default constructor
	public Certificate() {
		super();
	}
	
	//parameterized constructor
	public Certificate(String duration, String course) {
		super();
		this.duration = duration;
		this.course = course;
	}
	
	
	//getter setter
	
	public String getDuration() {
		return duration;
	}
	public String getCourse() {
		return course;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public void setCourse(String course) {
		this.course = course;
	}

}
