package b.AdapterPattern.IteratorToEnumeration;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorAdapter implements Enumeration {
	Iterator iterator;
	
	public IteratorAdapter(Iterator iterator) {
		this.iterator =iterator;
	}

	@Override
	public boolean hasMoreElements() {
		// TODO Auto-generated method stub
		return iterator.hasNext();
	}

	@Override
	public Object nextElement() {
		// TODO Auto-generated method stub
		return iterator.next();
	}

}
