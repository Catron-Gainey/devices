package devices;

public class Device {
	private int battery;

	public Device () {
		this.battery = 100;
			}

	public void displayBatVal(){
	System.out.println(battery);
	}
	
	public int setBattery(int batteryLevel) {
	this.battery = batteryLevel;
	return this.battery;
	}

	public int getBattery() {
		return battery;
	}
	
	
	
}
