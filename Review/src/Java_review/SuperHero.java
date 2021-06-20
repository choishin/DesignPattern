package Java_review;

public class SuperHero extends Hero{
	private boolean isFly;

	public SuperHero(String name, int hp) {
		super(name, hp);
		// TODO Auto-generated constructor stub		
	}
	
	
	
	@Override
	public void attack(Slime slime) {
		// TODO Auto-generated method stub
		super.attack(slime);
		
		if (isFly) {
			super.attack(slime);
		}
	}

	@Override
	public void attack(Bat bat) {
		// TODO Auto-generated method stub
		super.attack(bat);
	}



	public void fly() {		
		isFly = true;
		
	}
	
	public void land() {
		isFly = false;
	}

}
