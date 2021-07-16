package d.MetaCommandPattern.UndoCeilingFan;

public class RemoteLoader {
	
	public static void main (String[] args) {
		RemoteControlWithUndo remote = new RemoteControlWithUndo();
		CeilingFan LivingRoomCeilingFan = new CeilingFan("LivingRoom");
		
		CeilingFanHighCommand LivingRoomCeilingFanHighCommand = new CeilingFanHighCommand(LivingRoomCeilingFan);
		CeilingFanMediumCommand LivingRoomCeilingFanMediumCommand = new CeilingFanMediumCommand(LivingRoomCeilingFan);
		CeilingFanLowCommand LivingRoomCeilingFanLowCommand = new CeilingFanLowCommand(LivingRoomCeilingFan);
		CeilingFanOffCommand LivingRoomCeilingFanOffCommand = new CeilingFanOffCommand(LivingRoomCeilingFan);
		
		remote.setCommand(0, LivingRoomCeilingFanMediumCommand, LivingRoomCeilingFanOffCommand);
		remote.setCommand(1, LivingRoomCeilingFanHighCommand, LivingRoomCeilingFanOffCommand);
		
		System.out.println(remote);		
		remote.onbuttonWasPressed(0);
		remote.offbuttonWasPressed(0);
		System.out.println(remote);
		remote.undobuttonWasPressed();
		
		remote.onbuttonWasPressed(1);
		System.out.println(remote);
		remote.undobuttonWasPressed();
		
		
	}

}
