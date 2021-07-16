package b.PizzaStore.AbstractFactoryPattern;

public class PizzaTestDrive {
	
	public static void main (String[] args) {
		PizzaStore nyPizzaStore = new NYPizzaStore();
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
			
		Pizza pizza = nyPizzaStore.orderPizza("cheese");
		System.out.println("Ethan ordered a "+pizza.getName()+"\n");
		
		Pizza pizza2 = chicagoPizzaStore.orderPizza("cheese");
		System.out.println("Joel orderd a "+pizza2.getName()+"\n");
		

	}

}
