package june6;
//using java bean === java bean are classes that encapsulate many object as one object 
                      //all properties are private with public getter and setter
                      //it has no args public constructor or args public constructor
//we use java bean to access private fields ouside the class 
 class NewClass {
	private String car_model;
	private String car_number;
	private int carPrice;
	private String Owner ="harshita";
	@Override
	public String toString() {
		return Owner;
	}
	public String getCar_model() {
		return car_model;
	}
	public void setCar_model(String car_model) {
		this.car_model = car_model;
	}
	public String getCar_number() {
		return car_number;
	}
	public void setCar_number(String car_number) {
		this.car_number = car_number;
	}
	public NewClass() {
		carPrice=120000;
		System.out.println(carPrice);
	}
	

}
