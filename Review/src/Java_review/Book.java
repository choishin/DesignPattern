package Java_review;

public class Book extends TangibleAsset {	
	private String isbn;

	public Book(String name, int price, String color, int weight, String isbn) {
		super(name, price, color, weight);
		this.isbn = isbn;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setWeight(double weight) {
		// TODO Auto-generated method stub
		
	}

}
