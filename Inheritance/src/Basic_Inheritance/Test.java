package Basic_Inheritance;

public class Test {
	
	 public boolean isValid(String s) {

	        boolean b =false;
	        
	        if(s=="()"){
	            b=true;
	        }
	        
	        if(s=="{}") {
	        	b=true;
	        }
	        if(s=="[]") {
	        	b=true;
	        }
	        return b;

	        
	    }
	 
	 public static void main(String[] args) {
		 Test t = new Test();
		System.out.println( t.isValid("()"));
		
	}
	

	}
		

		
		
	


