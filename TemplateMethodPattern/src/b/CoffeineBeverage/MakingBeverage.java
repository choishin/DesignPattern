package b.CoffeineBeverage;

public class MakingBeverage {
	public static void main (String[] args) {
		
		System.out.println("----차를 만들기----");
		Tea myTea = new Tea();
		myTea.prepareRecipe();
		
		System.out.println("----커피를 만들기----");
		Coffee myCoffee = new Coffee();
		myCoffee.prepareRecipe();
	}

}
