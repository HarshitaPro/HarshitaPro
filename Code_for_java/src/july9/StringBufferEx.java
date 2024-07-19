package july9;

public class StringBufferEx {
	
	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer("harshita");//it is not threadsafe
		StringBuffer s1 = new StringBuffer("harshita");
		
	     s.append("  chourasiya");
	       System.out.println(s);
	       
//	       s.reverse();
//	       System.out.println(s);
	      s.append("hello");
	       
	      s.replace(9,10, "java");
	       System.out.println(s);
	       
	       StringBuilder b = new StringBuilder("harshita"); //it is threadsafe
	       b.append("  chourasiya");
	       System.out.println(b);
	}

}
