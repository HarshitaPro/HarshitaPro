package coupling;

public class Employee_factory {
	
	public Employee getEmployee(String empType) {
		
		if(empType.trim().equalsIgnoreCase("android")) {
			return new Android_developer();
		}
		else if(empType.trim().equalsIgnoreCase("web")) {
			
			return new Web_developer();
		}
		else {
			return null;
		}
	}

}
