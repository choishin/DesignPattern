package a.Starbucks;

public abstract class Beverage {
	String description = "";
	String size;
	
	public String getDescription() {
		return description;
	}
	
	//����Ŭ�������� ������ �Ǿ����.
	public abstract double cost();

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
		
}
