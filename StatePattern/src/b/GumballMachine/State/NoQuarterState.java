package b.GumballMachine.State;

public class NoQuarterState implements State {
	GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("������ �����̽��ϴ�.");
		gumballMachine.setNumberGumballs(gumballMachine.getNumberGumballs()+1);
		
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("������ �־��ּ���.");
		
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("������ �־��ּ���.");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("������ �־��ּ���.");
	}

}
