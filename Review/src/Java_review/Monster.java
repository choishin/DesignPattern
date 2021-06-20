package Java_review;

public abstract class Monster {
	protected String name;
	protected int hp;
	
	
	public Monster(String name, int hp) {
		super();
		this.name = name;
		this.hp = hp;
	}

	public abstract void attack();

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}
	
	

}
