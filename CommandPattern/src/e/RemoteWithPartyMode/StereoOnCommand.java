package e.RemoteWithPartyMode;

public class StereoOnCommand implements Command {
	Stereo stereo;
	
	public StereoOnCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stereo.on();
		stereo.setCD();
		stereo.setVolume(10);
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		stereo.off();
	}

}
