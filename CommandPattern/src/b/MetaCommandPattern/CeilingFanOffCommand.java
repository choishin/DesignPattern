package b.MetaCommandPattern;

public class CeilingFanOffCommand implements Command {
	CeilingFan ceilingFan;
	
	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ceilingFan.off();
	}

}
