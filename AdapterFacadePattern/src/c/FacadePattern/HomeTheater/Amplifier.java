package c.FacadePattern.HomeTheater;

public class Amplifier {

	void on() {System.out.println("Top-O-Line Amplifier on");}
	void setDVD(String dvd) {System.out.println("Top-O-Line Amplifier setting DVD Player to Top-O-Line DVD Player");}
	void setSurrondSound() {System.out.println("Top-O-Line Amplifier surround sound on (5 speakers, 1 subwoofer)");}
	void setVolume(int volume) {System.out.println("Top-O-Line Amplifier setting volume to "+volume);}
	void off() {System.out.println("Top-O-Line Amplifier off");}
}
