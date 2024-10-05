package Design_Patterns_Factory;

public class Employee_Factory {
	
	   public static  Employee Get_emp_salary(String empType) {
		   
		   if(empType.trim().equalsIgnoreCase("Android Deveploper")) {
			   return new Android_Developer();
		   }
		   else if(empType.trim().equalsIgnoreCase("Web Developer")) {
			   return new Web_Developer();
		   }
		   else {
			   return null;
		   }
		   
	   }

}
