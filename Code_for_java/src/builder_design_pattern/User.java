package builder_design_pattern;

public class User {
	
	private int user_id;
	private String user_name;
	private String department;
	//getters
	public int getUser_id() {
		return user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public String getDepartment() {
		return department;
	}
	
	//private constructor
	private User(User_data d) {
		this.user_id= d.user_id;
		this.user_name= d.user_name;
		this.department= d.department;
	}
	
	//inner class
    static class User_data{
    	
    	private int user_id;
    	private String user_name;
    	private String department;
    	
    	public User_data() {}
    	 

	public User_data  setUser_id(int user_id) {
		this.user_id = user_id;
		return this;
	}
	public User_data setUser_name(String user_name) {
		this.user_name = user_name;
		return this;
	}
	public User_data setDepartment(String department) {
		this.department = department;
	      return this;
	}
	
	public User build() {
		User u = new User(this); 
		return u;
		
	}
	
	
    }

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", department=" + department + "]";
	}	

}
