package a.ChocolateBoiler;

public class ChocolateMaking {
	
	static ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
	
	//�ȵ�. �����ڸ� private�� ���� ���� ������
	//ChocolateBoiler chocolateBoiler2 = new ChocolateBoiler();
	
	public static void main (String[] args) {
		chocolateBoiler.fill();
		chocolateBoiler.boil();
		chocolateBoiler.drain();
	}	

}
