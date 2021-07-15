package e.SimUDuck.CodeTest;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}

	void display() {
		System.out.println("가짜오리");
	}	
}
