package h.Waitress.CompositeIterator;

import java.util.Iterator;

public class NullIterator implements Iterator{

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
