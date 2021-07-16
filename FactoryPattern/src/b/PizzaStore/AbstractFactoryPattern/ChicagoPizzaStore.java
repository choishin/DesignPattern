package b.PizzaStore.AbstractFactoryPattern;

public class ChicagoPizzaStore extends PizzaStore {
	
	@Override
	protected Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoIngredientFactory();
		if (type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");
		} else if (type.equals("pepperoni")) {
			
		} else if (type.equals("clam")) {
			
		} else if (type.equals("veggie")) {
			
		}
		return pizza;
	}

}
