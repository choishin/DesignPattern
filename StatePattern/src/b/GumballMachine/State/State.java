package b.GumballMachine.State;

public interface State {
	
	void insertQuarter();
	void ejectQuarter();
	void turnCrank();
	void dispense();

}
