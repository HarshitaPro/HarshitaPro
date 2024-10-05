package practicee;

import java.util.Arrays;



public class Convert {
	
	public String Convert_Array(int[]array) {
      String s1 =Arrays.toString(array);
		
		
		
		String s2 = s1.replaceAll(" ", "");
		String s3 = s2.replaceAll(",", "");
		
		
		return s3;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5};
		
		Convert c = new Convert();
		System.out.println("After converting:"+c.Convert_Array(array));
		
		
		
		
		
	}

}
