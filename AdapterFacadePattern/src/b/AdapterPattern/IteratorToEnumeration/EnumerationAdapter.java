package b.AdapterPattern.IteratorToEnumeration;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationAdapter implements Iterator{
	Enumeration enumeration;
	
	public EnumerationAdapter(Enumeration enumeration) {
		this.enumeration=enumeration;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return enumeration.hasMoreElements();
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return enumeration.nextElement();
	}
	
}
