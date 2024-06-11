package Basic_Inheritance;

public class Demo1 {
	//there are three subclass of Appliance 
	//WashingMachine ,refrigerator,Television
	//demo class ==> used to create objects of those subclasses

	public static void main(String[] args) {
		WashingMachine wm = new WashingMachine();
		//setting value using setter
				wm.setBrandName("whilpool");
				wm.setPrice(120000);
				wm.setSize("5 litre");
				wm.setType("manaual");
		//setting value using parametrize constructor
		WashingMachine wm2 = new WashingMachine("samsung",8000,"manaual","5litre");
				
				//printing values of wm object
				System.out.println("brand of washing machine==>"+wm.getBrandName());
				System.out.println("Price of Washing Machine==>"+wm.getPrice());
				System.out.println("type of wahing Machine==>"+wm.getType());
				System.out.println("Size of Washing machine==>"+wm.getSize());
				System.out.println();
				//printing value of wm2 object
				System.out.println("brand of washing machine==>"+wm2.getBrandName());
				System.out.println("Price of Washing Machine==>"+wm2.getPrice());
				System.out.println("type of wahing Machine==>"+wm2.getType());
				System.out.println("Size of Washing machine==>"+wm2.getSize());
				System.out.println();
				//printing whole value of wm object
				System.out.println(wm);
				//pring whole values of wm2 object
				System.out.println(wm2);
				System.out.println();
				//creating object of refrigerator
				Refrigerator r = new Refrigerator();
				r.setBrandName("L.G");
				r.setPrice(300000);
				r.setDoor("Double door");
				r.setStar("5 star");
				
				//creating objet and set value of fields using constructor
				Refrigerator r1 = new Refrigerator("samsung",20000,"4star","single door");
				//printing values of r
				System.out.println("brand name of Refrigerator==>"+r.getBrandName());
				System.out.println("price of Refrigerator==>"+r.getPrice());
				System.out.println("performance ==>"+r.getStar());
				System.out.println("other info="+r.getDoor());
				System.out.println();
				//printing values of r1
				
				System.out.println("brand name of Refrigerator==>"+r1.getBrandName());
				System.out.println("price of Refrigerator==>"+r1.getPrice());
				System.out.println("performance ==>"+r1.getStar());
				System.out.println("other info="+r1.getDoor());
				System.out.println();
				//creating object of television class
				Television t = new Television() ;
				//setting values
					t.setBrandName("Haier");
					t.setPrice(130000);
					t.setLoudness("high");
					t.setSize("36 inches");
					//set values using constructor
					Television t2 = new Television("L.G",12000,"38 inches","high");
					//printing values of t
					System.out.println("brand name of Television==>"+t.getBrandName());
					System.out.println("price of Television==>"+t.getPrice());
					System.out.println("Loudness ==>"+t.getLoudness());
					System.out.println("size==>"+t.getSize());
					System.out.println();
					//printing value of T2
					System.out.println("brand name of Television==>"+t.getBrandName());
					System.out.println("price of Television==>"+t.getPrice());
					System.out.println("Loudness ==>"+t.getLoudness());
					System.out.println("size==>"+t.getSize());
					System.out.println();
					
					
					
				
				
				
				
				
				
		

	}

}
