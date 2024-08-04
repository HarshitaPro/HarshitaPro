package july8;

public class Mainn {
	  public static void main(String[] args) {

	        Container<Integer> intContainer = new Container<>();

	        intContainer.add(1);

	        intContainer.add(2);

	        intContainer.add(3);

	        System.out.println(intContainer.get(0)); // prints 1



	        Container<String> strContainer = new Container<>();

	        strContainer.add("Hello");

	        strContainer.add("World");

	        System.out.println(strContainer.get(1)); // prints World



	        Container<Person> personContainer = new Container<>();

	        personContainer.add(new Person("John", 25));

	        personContainer.add(new Person("Jane", 30));

	        System.out.println(personContainer.get(0).getName()); // prints John

	    }

	}


