package hibernate.hql;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
	
	private String course;
	private String duration;
	
	//constructor
	public Certificate() {
		super();
	}
	//param constructor
	public Certificate(String course, String duration) {
		super();
		this.course = course;
		this.duration = duration;
	}
	//getter setters
	public String getCourse() {
		return course;
	}
	public String getDuration() {
		return duration;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	

	

}
