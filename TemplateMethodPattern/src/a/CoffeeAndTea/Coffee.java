package a.CoffeeAndTea;

public class Coffee {

	void prepareRecipe() {
		boilWater();
		brewCoffeGrinds();
		pourInCup();
		addSugarAndMilk();
	}

	public void boilWater() {
		System.out.println("�� ���̴� ��");
	}

	public void brewCoffeGrinds() {
		System.out.println("���͸� ���ؼ� Ŀ�Ǹ� ������� ��");
	}
	
	public void pourInCup() {
		System.out.println("�ſ� ������ ��");
	}

	public void addSugarAndMilk() {
		System.out.println("������ ������ �߰��ϴ� ��");
	}

}
