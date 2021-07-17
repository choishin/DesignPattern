package e.RemoteWithPartyMode;

public class Hottub {
	int temperature = 60;

	public Hottub() {
	}

	void on() {
		System.out.println("Hottub is on");
	}

	void off() {
		System.out.println("Hottub is off");
	}

	void circulate() {
		System.out.println("Hottub is circulating");
	}

	void jetsOn() {
		System.out.println("Hottub is bubbling");
	}

	void jetsOff() {
		System.out.println("Bubbling is off");
	}

	void setTemperature(int temperature) {
		if (this.temperature > temperature) {
			this.temperature = temperature;
			System.out.println("Hottub is Cooling to " + temperature + " degrees");
		} else if (this.temperature <= temperature) {
			this.temperature = temperature;
			System.out.println("Hottub is heating to a steaming " + temperature + " degrees");
		}

	}

}
