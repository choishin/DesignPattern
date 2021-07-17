package c.FacadePattern.HomeTheater;

public class HomeTheaterTestDrive {
	public static void main (String[] args) {
		Amplifier amp = new Amplifier();
		Tuner tuner = new Tuner();
		DVDPlayer dvd = new DVDPlayer();
		CDPlayer cdPlayer = new CDPlayer();
		Projector projector = new Projector();
		TheaterLight lights = new TheaterLight();
		Screen screen = new Screen();
		PopcornPopper popper = new PopcornPopper();
		
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp,tuner,dvd,cdPlayer,projector,lights,screen,popper);
		homeTheater.watchMovie("Raiders of the Lost Ark");
		homeTheater.endMovie();
	}

}
