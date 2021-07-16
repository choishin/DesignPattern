package a.PizzaStore.FactoryPattern;

public class CalifoniaPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza =null;
		if (type.equals("camari")) {
			pizza = new CamariPizza();
		}
		else if (type.equals("bruschettaSauce")) {
			pizza = new BruschettaSaucePizza();
		}
		else if (type.equals("veryThinCrust")) {
			pizza = new VeryThinCrustPizza();
		}
		else if (type.equals("goatCheese")) {
			pizza = new GoatCheesePizza();
		}
		return pizza;
	}

}
