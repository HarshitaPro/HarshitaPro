package Oobject;

public class HashCodeCollission {
	
	public static void main(String[] args) {
		String ss = "Aa";
		String ss1 = "BB";
		System.out.println(ss.hashCode());
		System.out.println(ss.hashCode());
	}

}
