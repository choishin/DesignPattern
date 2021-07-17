package b.CoffeineBeverage;

public class Coffee extends CaffeineBeverage {

	@Override
	public void brew() {
		// TODO Auto-generated method stub
		System.out.println("필터를 통해서 커피를 우려내는 중");
		
	}

	@Override
	public void addCodiments() {
		// TODO Auto-generated method stub
		System.out.println("설탕과 우유를 추가하는 중");
	}

}
