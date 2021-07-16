package b.PizzaStore.AbstractFactoryPattern;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYIngredientFactory();
		if (type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("NY Style Cheese Pizza");
		} else if (type.equals("pepperoni")) {
			
		} else if (type.equals("clam")) {
			
		} else if (type.equals("veggie")) {
			
		}
		return pizza;
	}

}
