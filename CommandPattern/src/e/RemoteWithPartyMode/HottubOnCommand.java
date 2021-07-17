package e.RemoteWithPartyMode;

public class HottubOnCommand implements Command{
	Hottub hottub;
	
	
	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		hottub.on();
		hottub.jetsOn();
	
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		hottub.off();
	}

	
}
