package f.StrategyPattern.Practice;

public class Queen extends Character{
	
	public Queen() {	
		weaponBehavior = new BowAndArrowBehavior();
	}

}