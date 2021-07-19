package b.GumballMachine.State;

public class HasQuarterState implements State {
	GumballMachine gumballMachine;
	
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("동전을 넣으셨습니다.");
		gumballMachine.setNumberGumballs(gumballMachine.getNumberGumballs()+1);
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("동전이 반환됩니다.");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("손잡이를 돌리셨습니다.");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("알맹이가 나가고 있습니다.");
		gumballMachine.releaseBall();
		if (gumballMachine.getNumberGumballs() >0) {
			gumballMachine.setState(gumballMachine.getHasQuarter());
		}else {
			System.out.println("Oops, out of gumballs");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

}
