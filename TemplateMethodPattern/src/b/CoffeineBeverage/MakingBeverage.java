package b.CoffeineBeverage;

public class MakingBeverage {
	public static void main (String[] args) {
		
		System.out.println("----���� �����----");
		Tea myTea = new Tea();
		myTea.prepareRecipe();
		
		System.out.println("----Ŀ�Ǹ� �����----");
		Coffee myCoffee = new Coffee();
		myCoffee.prepareRecipe();
	}

}
