package e.SimUDuck.CodeTest;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	void display() { System.out.println("Ã»µÕ¿À¸®");}
}
