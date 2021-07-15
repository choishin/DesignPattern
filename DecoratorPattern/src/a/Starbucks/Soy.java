package a.Starbucks;

public class Soy extends CodimentDecorator{
	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + "µŒ¿Ø";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		String size = getSize();	
		double additional = 0;
		if (size.equals("Tall")) {
			additional = 0.1;
		}
		else if (size.equals("Grande")) {
			additional = 0.15;
		}
		else if (size.equals("Venti")) {
			additional = 0.2;
		}		
		return beverage.cost() + .15 + additional;
	}
	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return beverage.getSize();
	}

}
