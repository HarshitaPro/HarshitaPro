package this_keyword;

public class Test {
	
	public boolean Isvalid(String s) {
		while(true) {
		if(s.contains("()")) {
		s=s.replace("()", "");
		}
		else if(s.contains("{}")) {
			s=s.replace("{}", "");
		}
		else if(s.contains("[]")) {
			s=s.replace("[]", "");
		}
		else {
			return s.isEmpty();
		}
			
	
	}
	}
	
	public static void main(String[] args) {
		
			Test t = new Test();
			System.out.println(t.Isvalid("{}{"));
		//	t.Isvalid("{}{");
		
		
	}

}
