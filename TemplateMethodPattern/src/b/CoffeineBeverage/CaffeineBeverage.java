package b.CoffeineBeverage;

public abstract class CaffeineBeverage {

	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCodiments();
	}

	public void boilWater() {
		System.out.println("�� ���̴� ��");
	}

	public abstract void brew();

	public void pourInCup() {
		System.out.println("�ſ� ������ ��");
	}

	public abstract void addCodiments();

}
