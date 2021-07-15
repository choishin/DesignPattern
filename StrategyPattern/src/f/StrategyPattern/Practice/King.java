package f.StrategyPattern.Practice;

public class King extends Character {
	
	public King() {
		weaponBehavior = new SwordBehavior();
	}
	
}
