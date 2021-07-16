package c.MetaCommandPattern.UndoLight;

public class Light {
	String name;
	
	public Light (String name) {
		this.name = name;
	}
	
	void on() {System.out.println(name+" Light on");}
	void off() {System.out.println(name+" Light off");}

}
