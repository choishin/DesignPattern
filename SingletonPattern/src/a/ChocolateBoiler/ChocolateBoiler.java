package a.ChocolateBoiler;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;	
	private static ChocolateBoiler uniqueInstance;
	
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	public static ChocolateBoiler getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new ChocolateBoiler();
		}
		return uniqueInstance;
	}
		
	public void fill() {
		if (isEmpty()) {
			//���Ϸ��� ���ݸ��� ������ ȥ���� ��Ḧ ����
			empty = false;
			boiled = false;
		}
	}
	
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			//��Ḧ ����
			boiled = true;
			
		}
	}
	
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			//���� ���ݸ��� ���� �ܰ�� �ѱ�
			empty = true;
			
		}
	}

	public boolean isEmpty() {
		return empty;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}

	public boolean isBoiled() {
		return boiled;
	}

	public void setBoiled(boolean boiled) {
		this.boiled = boiled;
	}
	
}
