package c.CoffeineBeverageWithHook;


public class MakingBeverage {
	public static void main (String[] args) {
	
		System.out.println("----차 만들기----");
		Tea myTea = new Tea();
		myTea.prepareRecipe();
		
		System.out.println("----커피 만들기----");
		Coffee myCoffee = new Coffee();
		myCoffee.prepareRecipe();
	}

}
