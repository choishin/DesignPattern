package d.SimUDuck.BehaviorInstance;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	void display() { System.out.println("û�տ���");}
}
