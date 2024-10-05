package builder_design_pattern;

import builder_design_pattern.User.User_data;

public class Test {
	
	public static void main(String[] args) {
		
	User u = new User.User_data().setUser_id(123).setDepartment("It").setUser_name("harshita").build();
	System.out.println(u);
	
		
		
		
	}

}
