package Java_review;

public class Hero extends Character implements Comparable<Hero> {
	private int maxHp;
	
	
	public Hero(String name, int hp) {
		super(name, hp);

	}
	
	public void attack(Monster slime) {
		slime.setHp(slime.getHp() -5);
	}

	public void attack(Bat bat) {
		bat.setHp(bat.getHp() -5);
	}

	@Override
	public void attack(Slime slime) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(Hero hero) {
		// TODO Auto-generated method stub
		
		if (this.hp <hero.hp)
			
		return this.name.compareTo(hero.name);
	}



	
	
	
}
