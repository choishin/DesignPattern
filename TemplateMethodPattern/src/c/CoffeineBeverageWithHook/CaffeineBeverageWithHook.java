package c.CoffeineBeverageWithHook;

public abstract class CaffeineBeverageWithHook {

	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCodiments()) {
			addCodiments();
		}
	}

	public void boilWater() {
		System.out.println("�� ���̴� ��");
	}

	public abstract void brew();

	public void pourInCup() {
		System.out.println("�ſ� ������ ��");
	}

	public abstract void addCodiments();

	boolean customerWantsCodiments() {
		return true;
	}

}
