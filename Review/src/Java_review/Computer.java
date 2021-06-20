package Java_review;

public class Computer {
	private String name;
	private int price;
	private String color;
	private String makeName;

	
	public Computer(String name, int price, String color, String makeName) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
		this.makeName = makeName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMakeName() {
		return makeName;
	}

	public void setMakeName(String makeName) {
		this.makeName = makeName;
	}
	
	
	

}
