package this_keyword;

public  final class Immutable {
	
	final String name;
	
	Immutable(String n){
		this.name = n;
	}
	
	public static void main(String[] args) {
		Immutable i = new Immutable("harshita");
		System.out.println(i.name);
		//try to set value of final variable
		//i.name="nikhil";//compile time error
				
	}

}
