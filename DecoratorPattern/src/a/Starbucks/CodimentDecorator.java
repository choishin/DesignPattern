package a.Starbucks;

//우선 베이스가 될 음료를 포함하기
public abstract class CodimentDecorator extends Beverage {
	
	//이후 첨가물 데코레이터에서 새로 구현하도록 만들 계획.
	public abstract String getDescription();
	
	public abstract String getSize();

}
