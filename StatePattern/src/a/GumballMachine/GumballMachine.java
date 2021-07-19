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
	
	//������ �ִ� ���
	public void insertQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("������ �����̽��ϴ�.");
			count++;
		}
		else if (state == NO_QUARTER) {
			System.out.println("������ �����̽��ϴ�.");
			count++;
		}
		else if (state == SOLD_OUT) {
			System.out.println("�����Ǿ����ϴ�. ���� ��ȸ�� �̿��� �ּ���");
		}
		else if (state == SOLD) {
			System.out.println("��� ��ٷ��ּ���. �˸��̰� ������ �ֽ��ϴ�.");
		}
		
	}
	//������ ��ȯ�Ϸ��� ���
	public void ejectQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("������ ��ȯ�˴ϴ�.");
		}
		else if (state == NO_QUARTER) {
			System.out.println("������ �־��ּ���.");
		}
		else if (state == SOLD_OUT) {
			System.out.println("������ ���� �ʾҽ��ϴ�. ������ ��ȯ���� �ʽ��ϴ�.");
		}
		else if (state == SOLD) {
			System.out.println("�̹� �˸��̸� �����̽��ϴ�.");
		}
		
	}
	//�����̸� ������ ���
	public void turnCrank() {
		if (count >0) {
			state = HAS_QUARTER;
			System.out.println("�����̸� �����̽��ϴ�.");
			dispense();
		}
		else if (state == NO_QUARTER) {
			System.out.println("������ �־��ּ���.");
		}
		else if (state == SOLD_OUT) {
			System.out.println("�����Ǿ����ϴ�.");
		}
		else if (state == SOLD) {
			System.out.println("�����̴� �ѹ��� �����ּ���");
		}
		
	}
	//�˸��� ������
	public void dispense() {
		if (state == SOLD) {
			System.out.println("�˸��̰� ���� �� �����ϴ�.");
		}
		else if (state == NO_QUARTER) {
			System.out.println("������ �־��ּ���.");
		}
		else if (state == SOLD_OUT) {
			System.out.println("�����Ǿ����ϴ�.");
		}
		else if (state == HAS_QUARTER) {
			System.out.println("��� ��ٷ��ּ���. �˸��̰� ������ �ֽ��ϴ�.");
			count = count-1;
			if (count == 0) {
				System.out.println("�� �̻� �˸��̰� �����ϴ�.");
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
			stateInWords ="����";
		}
		else if (state == NO_QUARTER) {
			stateInWords ="���� ���� �����";
		}
		else if (state == HAS_QUARTER) {
			stateInWords ="���� ���� �����";
		}
		else if (state == SOLD) {
			stateInWords ="���� ���� �����";
		}
		return "�ֽ�ȸ�� �ջ̱�\nGumballMachine [state=" + stateInWords + ", count=" + count + "]";
	}

	
}
 