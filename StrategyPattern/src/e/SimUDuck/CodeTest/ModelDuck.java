package e.SimUDuck.CodeTest;

public class ModelDuck extends Duck{

	public ModelDuck( ) {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
	
	public void display() {
		System.out.println("���� ���� �����Դϴ�!");
	}
}
