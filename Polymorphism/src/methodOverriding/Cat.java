package methodOverriding;

public class Cat extends Animal {
	@Override
	
	void makeSound() {
		
		System.out.println("meow meow");
	}
	
	void eat() {
		System.out.println("eating fish");
	}
	

}
