package c.FacadePattern.HomeTheater;

public class HomeTheaterFacade {
	Amplifier amp;
	Tuner tuner;
	DVDPlayer dvd;
	CDPlayer cdPlayer;
	Projector projector;
	TheaterLight lights;
	Screen screen;
	PopcornPopper popper;

	public HomeTheaterFacade(Amplifier amp, Tuner tuner, DVDPlayer dvd, 
			CDPlayer cdPlayer, Projector projector,
			TheaterLight lights, Screen screen, PopcornPopper popper) {

		this.amp = amp;
		this.tuner = tuner;
		this.dvd = dvd;
		this.cdPlayer = cdPlayer;
		this.projector = projector;
		this.lights = lights;
		this.screen = screen;
		this.popper = popper;
	}
	
	public void watchMovie(String movie) {
		System.out.println("Get readty to watch a movie...");
		popper.on();
		popper.pop();
		lights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setDVD(movie);
		amp.setSurrondSound();
		amp.setVolume(5);
		dvd.on();
		dvd.play(movie);
	
	}
	
	public void endMovie () {
		System.out.println("Shutting movie theater down...");
		popper.off();
		lights.on();
		screen.up();
		projector.off();
		amp.off();
		dvd.stop();
		dvd.eject();
		dvd.off();
	}

}
