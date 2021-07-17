package b.CoffeineBeverage;

public abstract class CaffeineBeverage {

	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCodiments();
	}

	public void boilWater() {
		System.out.println("물 끓이는 중");
	}

	public abstract void brew();

	public void pourInCup() {
		System.out.println("컵에 따르는 중");
	}

	public abstract void addCodiments();

}
