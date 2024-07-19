package july9;

public class StringEx {
	public static void main(String[] args) {
		
		//by literal
		String s = "Ramlal" ; // string is immutable
	// why string is immutable:
		
//		String  a ="Harshita";
//		a=a+s; //concatenation
//		System.out.println(a.equals(s));//false
//		
//		String a1 = new String("harshita");
//		System.out.println(a1==s);//false because == operatoror always check reference of two objects
//		System.out.println(a1.equals(s));//true equals method always check the content of String
//		
//		System.out.println(a==s);//true because its refrence is same
//		
//		//methods of String 
//		
//		System.out.println(a.contains("a"));//check whether character is present in string or not
//		
//	System.out.println(a.charAt(0));//we can check what character at certain index
//	System.out.println(a.length());
//	System.out.println(a.replace('s', 'a'));
//	System.out.println(a);
//	System.out.println(a.equals(s));//false
//	System.out.println(a.equalsIgnoreCase(a));//true
		String t ="";
		
		for(int i =0; i<s.length();i++) {
			 t ="";
			for(int j=0; j<s.length() ; j++) {
				t= t+s.charAt(j);
				
				System.out.println(t);
				if(t.equals(s)) {
					System.exit(0);
				}
				
				
			}
			
		}
		
		
	}

}