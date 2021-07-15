package f.StrategyPattern.Practice;

public class Troll extends Character {
	
	public Troll() {
		weaponBehavior = new AxeBehavior();
		
	}

}
