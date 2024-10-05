package builder_design_pattern;

public class Demo {
	
	public static void main(String[] args) {
		
		Computer c = new Computer.Builder().setHDD("hdd").
				                          setRAM("128GB").
				                      setGraphicsCardEnabled(false).setBluetoothEnabled(true).build();
		
		System.out.println(c);
		
	}

}
