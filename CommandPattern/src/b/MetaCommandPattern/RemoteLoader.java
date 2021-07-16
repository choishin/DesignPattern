package b.MetaCommandPattern;

public class RemoteLoader {
	
	public static void main (String[] args) {
		RemoteControl remote = new RemoteControl();
		Light livingRoomLight = new Light("LivingRoomLight");
		Light kichen = new Light("Kichen");
		CeilingFan LivingRoomCeilingFan = new CeilingFan("LivingRoom");
		GarageDoor garageDoor = new GarageDoor();
		Stereo LivingRoomStereo = new Stereo("LivingRoom");
		
		LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
		LightOnCommand kichenLightOnCommand = new LightOnCommand(kichen);
		LightOffCommand kichenLightOffCommand = new LightOffCommand(kichen);
		CeilingFanOnCommand LivingRoomCeilingFanOnCommand = new CeilingFanOnCommand(LivingRoomCeilingFan);
		CeilingFanOffCommand LivingRoomCeilingFanOffCommand = new CeilingFanOffCommand(LivingRoomCeilingFan);
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
		GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
		StereoOnCommand LivingRoomStereoOnCommand = new StereoOnCommand(LivingRoomStereo);
		StereoOffCommand LivingRoomStereoOffCommand = new StereoOffCommand(LivingRoomStereo);
		
		remote.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
		remote.setCommand(1, kichenLightOnCommand, kichenLightOffCommand);
		remote.setCommand(2, LivingRoomCeilingFanOnCommand, LivingRoomCeilingFanOffCommand);
		remote.setCommand(3, garageDoorOpenCommand, garageDoorCloseCommand);
		remote.setCommand(4, LivingRoomStereoOnCommand, LivingRoomStereoOffCommand);
		
		System.out.println(remote);
		
		remote.onbuttonWasPressed(0);
		remote.offbuttonWasPressed(0);
		remote.onbuttonWasPressed(1);
		remote.offbuttonWasPressed(1);
		remote.onbuttonWasPressed(2);
		remote.offbuttonWasPressed(2);
		remote.onbuttonWasPressed(3);
		remote.offbuttonWasPressed(3);
		remote.onbuttonWasPressed(4);
		remote.offbuttonWasPressed(4);
		
		
	}

}
