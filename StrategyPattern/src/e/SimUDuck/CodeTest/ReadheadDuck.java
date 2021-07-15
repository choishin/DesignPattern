package e.SimUDuck.CodeTest;

public class ReadheadDuck extends Duck {

	public ReadheadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	void display() {System.out.println("빨간머리오리");}
}
