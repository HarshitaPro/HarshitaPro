package single_Inheritance;

public class SmartPhone extends Device{
	protected String OperatingSystem;
	protected String CameraResolution;
	
	public void takePhoto() {
		System.out.println("clicking pics");
	}
	
	public void display() {
		System.out.println(super.brand);
		System.out.println(super.model);
		System.out.println(this.CameraResolution);
		System.out.println(this.OperatingSystem);
		
	}
	

}
