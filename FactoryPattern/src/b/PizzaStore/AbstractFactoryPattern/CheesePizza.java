package b.PizzaStore.AbstractFactoryPattern;

public class CheesePizza extends Pizza {	
	PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}	
	void prepare() {
		System.out.println("Preparing "+ name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
	
	void cut() {
		if (name.equals("Chicago Style Cheese Pizza")) {
			System.out.println("Cutting the pizza into square slices");
		}
		else {
			System.out.println("Cutting the pizza into diagonal slices");
		}
	}

}
