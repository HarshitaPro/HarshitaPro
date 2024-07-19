package july9;

public class StringQuestion {
	
	
	
	public static void main(String[] args) {
		
		
		
		String s1 = "Sharma is a good player and he is so puntual";
		
	
		String [] s2 = s1.split(" ");
		
		System.out.println(s2.length);
		
		for(int i=s2.length-1; i>=0;i--) {
		    String reverse =s2[i];
		    String r="";
		
		    for(int j =reverse.length()-1; j>=0; j--) {
		    	r = r+reverse.charAt(j);
		    
		    }
		    System.out.print(r+" ");
		   
		    
		}
		System.out.println();
		
		for(int i=0; i<s2.length;i++) {
		    String reverse =s2[i];
		    String r="";
		
		    for(int j =reverse.length()-1; j>=0; j--) {
		    	r = r+reverse.charAt(j);
		    
		    }
		    System.out.print(r+" ");
		   
		    
		}
		
		
		
		
		
		
	}

}

