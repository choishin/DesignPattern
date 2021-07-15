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
		System.out.println("��� ������ ���� ��ϴ�. ��¥ ������ ����");
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}

}

