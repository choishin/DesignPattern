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
			//보일러에 초콜릿과 우유를 혼합한 재료를 넣음
			empty = false;
			boiled = false;
		}
	}
	
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			//재료를 끓임
			boiled = true;
			
		}
	}
	
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			//끓인 초콜릿을 다음 단계로 넘김
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
