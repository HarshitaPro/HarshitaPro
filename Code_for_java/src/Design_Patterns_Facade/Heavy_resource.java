package Design_Patterns_Facade;
public class Heavy_resource {
	
	public static void main(String[] args) {
		
		Single_Object ss =  Single_Object.getInstance();
		Single_Object ss2 =  Single_Object.getInstance();
		if(ss.hashCode()==ss2.hashCode()) {
			System.out.println("yes");
		}
		
		
	}

}
