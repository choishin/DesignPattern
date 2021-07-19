package a.GumballMachine;

public class GumballMachine {
	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;
	
	static int state = 0;
	static int count = NO_QUARTER;
	
	public GumballMachine(int count) {
		this.count = count;
		if(count >0) {
			state =	HAS_QUARTER;	
		}
	}
	
	//동전을 넣는 경우
	public void insertQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("동전을 넣으셨습니다.");
			count++;
		}
		else if (state == NO_QUARTER) {
			System.out.println("동전을 넣으셨습니다.");
			count++;
		}
		else if (state == SOLD_OUT) {
			System.out.println("매진되었습니다. 다음 기회에 이용해 주세요");
		}
		else if (state == SOLD) {
			System.out.println("잠깐만 기다려주세요. 알맹이가 나가고 있습니다.");
		}
		
	}
	//동전을 반환하려는 경우
	public void ejectQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("동전이 반환됩니다.");
		}
		else if (state == NO_QUARTER) {
			System.out.println("동전을 넣어주세요.");
		}
		else if (state == SOLD_OUT) {
			System.out.println("동전을 넣지 않았습니다. 동전이 반환되지 않습니다.");
		}
		else if (state == SOLD) {
			System.out.println("이미 알맹이를 뽑으셨습니다.");
		}
		
	}
	//손잡이를 돌리는 경우
	public void turnCrank() {
		if (count >0) {
			state = HAS_QUARTER;
			System.out.println("손잡이를 돌리셨습니다.");
			dispense();
		}
		else if (state == NO_QUARTER) {
			System.out.println("동전을 넣어주세요.");
		}
		else if (state == SOLD_OUT) {
			System.out.println("매진되었습니다.");
		}
		else if (state == SOLD) {
			System.out.println("손잡이는 한번만 돌려주세요");
		}
		
	}
	//알맹이 꺼내기
	public void dispense() {
		if (state == SOLD) {
			System.out.println("알맹이가 나갈 수 없습니다.");
		}
		else if (state == NO_QUARTER) {
			System.out.println("동전을 넣어주세요.");
		}
		else if (state == SOLD_OUT) {
			System.out.println("매진되었습니다.");
		}
		else if (state == HAS_QUARTER) {
			System.out.println("잠깐만 기다려주세요. 알맹이가 나가고 있습니다.");
			count = count-1;
			if (count == 0) {
				System.out.println("더 이상 알맹이가 없습니다.");
				state = SOLD_OUT;
			} else {
				state = NO_QUARTER;
			}
			
		}
	}

	@Override
	public String toString() {
		String stateInWords="";
		if (state == SOLD_OUT) {
			stateInWords ="매진";
		}
		else if (state == NO_QUARTER) {
			stateInWords ="동전 투입 대기중";
		}
		else if (state == HAS_QUARTER) {
			stateInWords ="동전 투입 대기중";
		}
		else if (state == SOLD) {
			stateInWords ="동전 투입 대기중";
		}
		return "주식회사 왕뽑기\nGumballMachine [state=" + stateInWords + ", count=" + count + "]";
	}

	
}
 