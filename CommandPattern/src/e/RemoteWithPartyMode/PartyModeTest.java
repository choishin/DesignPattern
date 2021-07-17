package e.RemoteWithPartyMode;

public class PartyModeTest {
	
	public static void main(String[] args) {
		Light light = new Light("LivingRoom");
		TV tv = new TV("LivingRoom");
		Stereo stereo = new Stereo("LivingRoom");
		Hottub hottub = new Hottub();
		
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		TVOnCommand tvOn = new TVOnCommand(tv);
		TVOffCommand tvOff = new TVOffCommand(tv);
		StereoOnCommand stereoOn = new StereoOnCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		HottubOnCommand hottubOn = new HottubOnCommand(hottub);
		HottubOffCommand hottubOff = new HottubOffCommand(hottub);
		
		RemoteControl remote = new RemoteControl();
		Command[] onCommands = new Command[4];
		onCommands[0] = lightOn;
		onCommands[1] = tvOn;
		onCommands[2] = stereoOn;
		onCommands[3] = hottubOn;
		Command[] offCommands = new Command[4];
		offCommands[0] = lightOff;
		offCommands[1] = tvOff;
		offCommands[2] = stereoOff;
		offCommands[3] = hottubOff;
		
		MacroCommand partyModeOn = new MacroCommand(onCommands);
		MacroCommand partyModeOff = new MacroCommand(offCommands);
		remote.setCommand(0, partyModeOn, partyModeOff);
		
		System.out.println("remoteControl");
		System.out.println("---pushing Macro On---");
		remote.onButtonWasPressed(0);
		System.out.println("---pushing Macro Off---");
		remote.offButtonWasPressed(0);
	
	}

}
