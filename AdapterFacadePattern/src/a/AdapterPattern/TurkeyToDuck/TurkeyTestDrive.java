package a.AdapterPattern.TurkeyToDuck;

//Turkey -> Duck Adapter Test
public class TurkeyTestDrive {
	public static void main (String[] args) {
		MallardDuck mallardDuck = new MallardDuck();
		WildTurkey wildTurkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
		Turkey duckAdapter = new DuckAdapter(mallardDuck);
		
		System.out.println("The Turkey says...");
		wildTurkey.gobble();
		wildTurkey.fly();
		
		System.out.println("The Duck says...");
		mallardDuck.quack();
		mallardDuck.fly();
		
		System.out.println("Turkey With TurkeyAdapter says...");
		turkeyAdapter.quack();
		turkeyAdapter.fly();
		
		System.out.println("Duck With DuckAdapter says...");
		duckAdapter.gobble();
		duckAdapter.fly();
		
	}

}
