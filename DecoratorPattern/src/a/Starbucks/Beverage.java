package a.Starbucks;

public abstract class Beverage {
	String description = "";
	String size;
	
	public String getDescription() {
		return description;
	}
	
	//서브클래스에서 구현이 되어야함.
	public abstract double cost();

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
		
}
