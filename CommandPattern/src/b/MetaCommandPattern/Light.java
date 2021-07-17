package b.MetaCommandPattern;

public class Light {
	String location;
	
	public Light (String location) {
		this.location = location;
	}
	
	void on() {System.out.println(location+" Light on");}
	void off() {System.out.println(location+" Light off");}

}
