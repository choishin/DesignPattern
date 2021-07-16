package b.PizzaStore.AbstractFactoryPattern;

public class CalifoniaPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza =null;
		if (type.equals("cheese")) {
			
		}
		else if (type.equals("bruschettaSauce")) {
			
		}
		else if (type.equals("veryThinCrust")) {
			
		}
		else if (type.equals("goatCheese")) {
			
		}
		return pizza;
	}

}
