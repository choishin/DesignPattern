package a.AdapterPattern.TurkeyToDuck;

import java.util.Random;

public class DuckAdapter implements Turkey {
	Duck duck;
	Random rand;

	public DuckAdapter(Duck duck) {
		this.duck = duck;
	}

	@Override
	public void gobble() {
		// TODO Auto-generated method stub
		duck.quack();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		if (rand.nextInt(5) == 0) {
			duck.fly();
		}
	}

}
