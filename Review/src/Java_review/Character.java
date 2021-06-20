package Java_review;

public abstract class Character {
	protected String name;
	protected int hp;
	
	public abstract void attack(Slime slime);
	
	public Character(String name, int hp) {
		super();
		this.name = name;
		this.hp = hp;
	}

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

	@Override
	public String toString() {
		return "Character [name=" + name + ", hp=" + hp + "]";
	}
	
	

}
