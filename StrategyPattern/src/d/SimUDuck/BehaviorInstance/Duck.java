package d.SimUDuck.BehaviorInstance;

public class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	void swim() {}
	void display() {System.out.println("����");}
	
	public void performQuack() {
		quackBehavior.quack();
		
	}
	void performFly() {
		flyBehavior.fly();
	}
	
}
