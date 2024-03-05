package devices;

public class Phone extends Device{
	
	public void makeCall() {
		System.out.println(setBattery(getBattery() - 5));
	}
	public void playGame() {
		System.out.println(setBattery(getBattery() - 20));
	}
	public void charge() {
		int newBatLevel = setBattery(getBattery() + 50);
		if(newBatLevel > 100) {
			newBatLevel = 100;
		}
		System.out.println(newBatLevel);
	}
}
