package c.CoffeineBeverageWithHook;


public class MakingBeverage {
	public static void main (String[] args) {
	
		System.out.println("----�� �����----");
		Tea myTea = new Tea();
		myTea.prepareRecipe();
		
		System.out.println("----Ŀ�� �����----");
		Coffee myCoffee = new Coffee();
		myCoffee.prepareRecipe();
	}

}
