package c.MetaCommandPattern.UndoLight;

public class RemoteLoader {
	
	public static void main (String[] args) {
		RemoteControlWithUndo remote = new RemoteControlWithUndo();
		Light livingRoom = new Light("LivingRoom");
		Light kichen = new Light("Kichen");
		
		LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoom);
		LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoom);
		LightOnCommand kichenLightOnCommand = new LightOnCommand(kichen);
		LightOffCommand kichenLightOffCommand = new LightOffCommand(kichen);
		
		remote.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
		remote.setCommand(1, kichenLightOnCommand, kichenLightOffCommand);
		
		System.out.println(remote);		
		remote.onbuttonWasPressed(0);
		remote.offbuttonWasPressed(0);
		System.out.println(remote);
		remote.undobuttonWasPressed();
		remote.offbuttonWasPressed(0);
		remote.onbuttonWasPressed(0);
		System.out.println(remote);
		remote.undobuttonWasPressed();
		
		
	}

}
