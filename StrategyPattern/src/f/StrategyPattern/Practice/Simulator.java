package f.StrategyPattern.Practice;

public class Simulator {
	
	public static void main (String[] args) {
		Character king = new King();
		king.useWeapon();
		Character queen = new Queen();
		queen.useWeapon();
		Character knight = new Knight();
		knight.useWeapon();
		Character troll = new Troll();
		troll.useWeapon();
	}

}
