package e.SimUDuck.CodeTest;

public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
		
	void performFly() {
		flyBehavior.fly();
	}
	
	void performQuack() {
		quackBehavior.quack();
	}
	
	void display() {
		
	}
	
	void swim() {
		System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠");
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}

}

