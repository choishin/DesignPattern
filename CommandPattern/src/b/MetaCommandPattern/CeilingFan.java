package b.MetaCommandPattern;

public class CeilingFan {
	String name;
	
	public CeilingFan(String name) {
		this.name = name;
	}
	
	void on() {System.out.println(name+" CeilingFan is on high");}
	void off() {System.out.println(name+" CeilingFan is off");}

}
