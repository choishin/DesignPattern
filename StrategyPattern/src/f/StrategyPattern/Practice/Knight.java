package f.StrategyPattern.Practice;

public class Knight extends Character{
	
	public Knight() {
		weaponBehavior = new KnifeBehavior();
	
	}

}
