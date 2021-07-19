package b.GumballMachine.State;

public class GumballMachine {
	State noQuarter;
	State hasQuarter;
	State soldState;
	State soldOutState;	
	State state = soldOutState;
	static int numberGumballs = 0;
	
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		soldState = new SoldState(this);
		noQuarter = new NoQuarterState(this);
		hasQuarter = new HasQuarterState(this);
		this.numberGumballs = numberGumballs;
		if(numberGumballs >0) {
			state =	hasQuarter;	
		}
	}
	
	//������ �ִ� ���
	public void insertQuarter() {
		state.insertQuarter();
		
	}
	//������ ��ȯ�Ϸ��� ���
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	//�����̸� ������ ���
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (numberGumballs > 0) {
			numberGumballs = numberGumballs -1;
		}
	}

	public static int getNumberGumballs() {
		return numberGumballs;
	}

	public static void setNumberGumballs(int numberGumballs) {
		GumballMachine.numberGumballs = numberGumballs;
	}

	public State getNoQuarter() {
		return noQuarter;
	}

	public void setNoQuarter(State noQuarter) {
		this.noQuarter = noQuarter;
	}

	public State getHasQuarter() {
		return hasQuarter;
	}

	public void setHasQuarter(State hasQuarter) {
		this.hasQuarter = hasQuarter;
	}

	public State getSoldState() {
		return soldState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}
	
	public String toString() {
		String stateNow="";
		if (state != soldOutState) {
			stateNow="�������� �����";
		}
		else {
			stateNow ="����";
		}
		return "�ֽ�ȸ�� �ջ̱�\n�������� : "+getNumberGumballs()+"\n"+stateNow+"";
	}
	
}
 