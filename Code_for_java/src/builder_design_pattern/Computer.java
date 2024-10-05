package builder_design_pattern;

public class Computer {
	
	private final  String HDD;
	private  final  String RAM;
	private final boolean isGraphicsCardEnabled;
	private final boolean isBluetoothEnabled;
	
	//private constructor
	private Computer(Builder b ) {
		this.HDD = b.HDD;
		this.RAM= b.RAM;
		this.isGraphicsCardEnabled= b.isGraphicsCardEnabled;
		this.isBluetoothEnabled= b.isBluetoothEnabled;
	}
	//getters
	public String getHDD() {
		return HDD;
	}

	public String getRAM() {
		return RAM;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	
	
	//innner class
	
	public static class Builder {
		private String HDD;
		private String RAM;
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;
		
		
		

	public Builder setHDD(String hDD) {
		HDD = hDD;
		return this;
	}
	public Builder setRAM(String rAM) {
		RAM = rAM;
		return this;
	}
	public Builder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
		this.isGraphicsCardEnabled = isGraphicsCardEnabled;
		return this;
	}
	public Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
		this.isBluetoothEnabled = isBluetoothEnabled;
		return this;
	}
	public Computer build() {
		Computer c = new Computer(this);
		return c;
	}

	}


	@Override
	public String toString() {
		return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}
	
}
