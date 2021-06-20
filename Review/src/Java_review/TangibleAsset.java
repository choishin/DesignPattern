package Java_review;

public abstract class TangibleAsset implements Thing {
	protected String name;
	protected int price;
	protected String color;
	protected double weight;

	public TangibleAsset(String name, int price, String color, int weight) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
		this.weight = weight;
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
	
	

}
