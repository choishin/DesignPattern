package f.StrategyPattern.Practice;

public abstract class Character {
	
	WeaponBehavior weaponBehavior;
	
	void useWeapon() {
		weaponBehavior.useWeapon();
	}
	
	void setWeaponBehavior(WeaponBehavior wp) {
		this.weaponBehavior = wp;
	}
	void fight() {}
}
