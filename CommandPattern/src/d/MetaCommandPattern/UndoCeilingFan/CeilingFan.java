package d.MetaCommandPattern.UndoCeilingFan;

public class CeilingFan {
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	String name;
	int speed;
	
	public CeilingFan(String name) {
		this.name = name;
		speed = OFF;
	}
		
	public void high() {
		speed = HIGH;
		System.out.println(name+" ceiling Fan is on high");
	}
	public void medium() {
		speed = MEDIUM;
		System.out.println(name+" ceiling Fan is on medium");
	}
	public void low() {
		speed = LOW;
		System.out.println(name+" ceiling Fan is on low");
	}
	public void off() {
		speed = OFF;
		System.out.println(name+" ceiling Fan is on off");
	}
	
	public int getSpeed() {
		return speed;
	}

}
