package single_Inheritance;

public class Demo {

	public static void main(String[] args) {
		Laptop obj = new Laptop();
		obj.setBrand("dell");
		obj.setModel("5 generation model");
		
		obj.setBatteryLife("70%");
		//printing obj method and values
		System.out.println("brand name==>"+obj.getBrand());
		System.out.println("model==>"+obj.getModel());
		System.out.println("batteryLife==>"+obj.BatteryStatus());
		obj.turnOn();
		System.out.println();
		
		SmartPhone d = new SmartPhone() ;
		d.brand="realme";
		d.model="4th generation";
		d.CameraResolution="1800*1800";
		d.OperatingSystem="Android";
		d.turnOn();
		d.takePhoto();
		d.display();
		
			
		
			
			
		

	}

}

