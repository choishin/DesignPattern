package b.MetaCommandPattern;

public class CeilingFan {
	String location;
	
	public CeilingFan(String location) {
		this.location = location;
	}
	
	void on() {System.out.println(location+" CeilingFan is on high");}
	void off() {System.out.println(location+" CeilingFan is off");}

}
