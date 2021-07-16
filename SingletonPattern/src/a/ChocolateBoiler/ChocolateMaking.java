package a.ChocolateBoiler;

public class ChocolateMaking {
	
	static ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
	
	//안됨. 생성자를 private로 막아 놨기 때문에
	//ChocolateBoiler chocolateBoiler2 = new ChocolateBoiler();
	
	public static void main (String[] args) {
		chocolateBoiler.fill();
		chocolateBoiler.boil();
		chocolateBoiler.drain();
	}	

}
