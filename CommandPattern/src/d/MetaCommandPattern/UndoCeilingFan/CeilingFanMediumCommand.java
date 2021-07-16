package d.MetaCommandPattern.UndoCeilingFan;

public class CeilingFanMediumCommand implements Command {
	CeilingFan ceilingFan;
	int prevSpeed;

	public CeilingFanMediumCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.medium();
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
