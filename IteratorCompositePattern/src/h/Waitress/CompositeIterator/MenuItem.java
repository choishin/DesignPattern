package h.Waitress.CompositeIterator;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
	String name;
	String description;
	boolean vegiterian;
	double price;

	public MenuItem(String name, String description, boolean vegiterian, double price) {
		this.name = name;
		this.description = description;
		this.vegiterian = vegiterian;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public double getPrice() {
		return price;
	}
	public boolean isVegiterian() {
		return vegiterian;
	}
	public void print() {
		System.out.print(" "+getName());
		if (isVegiterian()) {
			System.out.print("(v)");
		}
		System.out.print(" , "+getPrice());
		System.out.print(" -- "+getDescription()+"\n");
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new NullIterator();
	}

}
