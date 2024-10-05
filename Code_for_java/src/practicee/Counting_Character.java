package practicee;

public class Counting_Character {
	
	public int Count(String s) {
		
		String s1 = s.replaceAll("[^a-z A-z]", "");
		System.out.println(s1);
		
		return s1.length();
		
	}
	public static void main(String[] args) {
		Counting_Character cc = new Counting_Character();
	     System.out.println(cc.Count("abc2647"));
		
		
	}
	
	

}
