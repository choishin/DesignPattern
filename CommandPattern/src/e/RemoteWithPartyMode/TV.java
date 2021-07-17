package e.RemoteWithPartyMode;

public class TV {
	String location;
	
	public TV(String location) {
		this.location = location;
	}
	
	void on() {System.out.println(location+" TV is on");}
	void off() {System.out.println(location+" TV is off");}
	void setInputChannel() {System.out.println(location+" TV channel is set for DVD");}
	void setVolume(int volume) {System.out.println("TV volume set : "+volume);}

}
