package b.GumballMachine.State;

public class HasQuarterState implements State {
	GumballMachine gumballMachine;
	
	public HasQuarterState(GumballMachine gumballMachine) {
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
		System.out.println("������ ��ȯ�˴ϴ�.");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("�����̸� �����̽��ϴ�.");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("�˸��̰� ������ �ֽ��ϴ�.");
		gumballMachine.releaseBall();
		if (gumballMachine.getNumberGumballs() >0) {
			gumballMachine.setState(gumballMachine.getHasQuarter());
		}else {
			System.out.println("Oops, out of gumballs");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

}
