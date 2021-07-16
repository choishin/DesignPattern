package d.MetaCommandPattern.UndoCeilingFan;

public class CeilingFanOffCommand implements Command {
	CeilingFan ceilingFan;
	int prevSpeed;
	
	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		if (prevSpeed == ceilingFan.HIGH) {
			ceilingFan.high();
		}
		else if (prevSpeed == ceilingFan.MEDIUM) {
			ceilingFan.medium();
		}
		else if (prevSpeed == ceilingFan.LOW) {
			ceilingFan.low();
		}
		else if (prevSpeed == ceilingFan.OFF) {
			ceilingFan.off();
		}
	}

}
