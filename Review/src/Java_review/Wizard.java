package Java_review;

public class Wizard extends Character {
	private int mp;
	
	public Wizard(String name, int hp, int mp) {
		super(name, mp);
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	public void heal(Hero hero) {
		mp -= 5;
		hero.setHp(hero.getHp() +10);
	}
	
	public void fireBall (Slime slime) {
		mp -= 3;
		slime.setHp(slime.getHp() -20);
	}

	@Override
	public void attack(Slime slime) {
		// TODO Auto-generated method stub
		
	}


	
	
	
	
}
