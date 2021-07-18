package g.Waitress.Composite;

import java.util.Iterator;

public abstract class MenuComponent {
	
	//상속받는 Class는 MenuComponent가 됨.
	public void add(MenuComponent menucomponent) {
		throw new UnsupportedOperationException();
	}
	public void remove(MenuComponent menucomponent) {
		throw new UnsupportedOperationException();
	}
	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
	
	public String getName() {
		throw new UnsupportedOperationException();
	}
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
	public boolean isVegiterian() {
		throw new UnsupportedOperationException();
	}
	public void print() {
		throw new UnsupportedOperationException();
	}
	protected abstract Iterator createIterator();

}
