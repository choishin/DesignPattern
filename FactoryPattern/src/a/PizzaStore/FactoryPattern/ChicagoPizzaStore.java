package a.PizzaStore.FactoryPattern;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new ChicagoStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new ChicagoStylePepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ChicagoStyleClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new ChicagoStyleVeggiePizza();
		}
		return pizza;
	}

}
