package Java_review;

public class Game {
	
	public void run() {
		
		System.out.println("���� ����");
		
		//���� ����
		Hero hero1 = new Hero("���̾��",100);
		Hero hero2 = new Hero("�丣",100);
		
		Monster slime = new Slime("��1", 50);
		Monster bat = new Bat("����",20);
		
		hero1.attack(slime);
		hero1.attack(bat);
		

		
		WalkingMonster wm = new Slime("������3",30);
		

		
		
	}
	
	public void attack(Slime slime) {
		
	}
	
	public static void main (String[] args) {
		Game game = new Game();
		game.run();
		
		
	}

}
