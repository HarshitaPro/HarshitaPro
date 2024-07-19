package this_keyword;

public class Animal {
	//here we use this keyword to call method in other method

	void eat() {
		System.out.println("eating");
	}
	void speak() {
		//this keyword must be first staement in any method(if we use it)
		this.eat();
		System.out.println("speaking");
		
	}
	public static void main(String[] args) {
		Animal a = new Animal();
		a.speak();
	}
	//speak method is call by object 
	//in speak method we call the method eat() using this keyword
}
