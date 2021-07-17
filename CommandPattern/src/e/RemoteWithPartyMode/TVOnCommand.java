package e.RemoteWithPartyMode;

public class TVOnCommand implements Command {
	TV tv;

	public TVOnCommand(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		tv.off();
	}
}
