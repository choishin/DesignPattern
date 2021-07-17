package c.FacadePattern.HomeTheater;

public class DVDPlayer {
	String movie;

	void on() {
		System.out.println("DVD Player on");
	}

	void play(String movie) {
		this.movie = movie;
		System.out.println("DVD Player playing " + "\"" + movie + "\"");
	}

	void stop() {
		System.out.println("DVD Player stopped " + "\"" + movie + "\"");
	}

	void eject() {
		System.out.println("DVD Player eject");
	}

	void off() {
		System.out.println("DVD Player off");
	}
}
