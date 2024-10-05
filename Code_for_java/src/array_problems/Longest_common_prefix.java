package array_problems;

import java.util.Arrays;

public class Longest_common_prefix {
	
	
	public static String finding_prefix(String[] str) {
		
		String first = str[0];
		String last = str[str.length-1];
		int index=0;
		Arrays.sort(str);
		
		for(int i=0;i<first.length();i++) {
			if(first.charAt(i)==last.charAt(i)) {
				index++;
			}
			else {
				break;
			}
				
		}
		
		if(index==0) {
			return "";
		}
		
		return first.substring(0,index);
		
	}
	
	public static void main(String[] args) {
		String [] arr= {"car", "racecar  ","flowing"};
		String prefix=finding_prefix(arr);
		System.out.println("prefix:"+prefix);
	}

}
