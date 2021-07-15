package e.SimUDuck.CodeTest;

public class MiniDuckSimulator {
	public static void main (String[] args) {
		
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.swim();
		mallard.performFly();
		mallard.performQuack();
		
		Duck modelDuck = new ModelDuck();
		modelDuck.performFly();
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		modelDuck.performFly();
		
		Duck decoyDuck = new DecoyDuck();
		decoyDuck.display();
		decoyDuck.swim();
		decoyDuck.performFly();
		decoyDuck.performQuack();
		
		Duck readheadDuck = new ReadheadDuck();
		readheadDuck.display();
		readheadDuck.swim();
		readheadDuck.performFly();
		readheadDuck.performQuack();
		
	}

}