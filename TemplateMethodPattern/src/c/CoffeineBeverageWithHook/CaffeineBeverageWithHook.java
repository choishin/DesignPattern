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
		System.out.println("물 끓이는 중");
	}

	public abstract void brew();

	public void pourInCup() {
		System.out.println("컵에 따르는 중");
	}

	public abstract void addCodiments();

	boolean customerWantsCodiments() {
		return true;
	}

}
