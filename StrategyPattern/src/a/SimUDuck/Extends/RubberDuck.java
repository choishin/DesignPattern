package a.SimUDuck.Extends;

public class RubberDuck extends Duck {
	
	void quack() {System.out.println("뿌");}
	void display() {System.out.println("장난감 오리");}
	
	//날면 안되는 장난감 오리는 메소드 안에 아무것도 하지 않도록 오버라이드!
	void fly() {}

}
