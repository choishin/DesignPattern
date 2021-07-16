package d.MetaCommandPattern.UndoCeilingFan;

public class Stereo {
	String name;
	
	public Stereo(String name) {
		this.name = name;
	}
	
	void on() {System.out.println("Stereo is on");}
	void setCD() {System.out.println("Stereo is set for CD input");}
	void setVolume(int volume) {System.out.println("Volume set to "+volume);}
	void off() {System.out.println("Stereo is off");}

}
