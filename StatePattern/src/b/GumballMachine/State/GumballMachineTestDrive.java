package b.GumballMachine.State;

public class GumballMachineTestDrive {
	public static void main (String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);
		System.out.println(gumballMachine.toString());
		gumballMachine.turnCrank();		
		System.out.println(gumballMachine.toString());
		gumballMachine.turnCrank();
		System.out.println(gumballMachine.toString());
		gumballMachine.insertQuarter();
		System.out.println(gumballMachine.toString());
		gumballMachine.turnCrank();
		System.out.println(gumballMachine.toString());
		gumballMachine.turnCrank();
		System.out.println(gumballMachine.toString());
		gumballMachine.turnCrank();
		System.out.println(gumballMachine.toString());
		gumballMachine.turnCrank();
		System.out.println(gumballMachine.toString());
		gumballMachine.turnCrank();
		System.out.println(gumballMachine.toString());

		
	}
}
