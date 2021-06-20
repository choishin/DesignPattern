package Java_review;

public class Game {
	
	public void run() {
		
		System.out.println("게임 시작");
		
		//영웅 등장
		Hero hero1 = new Hero("아이언맨",100);
		Hero hero2 = new Hero("토르",100);
		
		Monster slime = new Slime("적1", 50);
		Monster bat = new Bat("박쥐",20);
		
		hero1.attack(slime);
		hero1.attack(bat);
		

		
		WalkingMonster wm = new Slime("슬라임3",30);
		

		
		
	}
	
	public void attack(Slime slime) {
		
	}
	
	public static void main (String[] args) {
		Game game = new Game();
		game.run();
		
		
	}

}
