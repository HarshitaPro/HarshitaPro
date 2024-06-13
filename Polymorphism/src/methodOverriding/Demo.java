package methodOverriding;

public class Demo {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.makeSound();
		d.eat();
		
		Animal a1 = new Animal();
		a1.makeSound();
		a1.eat();
		Cat c = new Cat();
		
		c.makeSound();
		c.eat();
		
		

	}

}
