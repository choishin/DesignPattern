package d.MetaCommandPattern.UndoCeilingFan;

public class GarageDoorCloseCommand implements Command {
	GarageDoor garageDoor;
	
	public GarageDoorCloseCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		garageDoor.close();
	}
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		garageDoor.open();
	}

}