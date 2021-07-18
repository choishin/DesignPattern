package c.Waitress.Iterator;

import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenuIterator implements Iterator{
	List<MenuItem> menuItems;
	int position =0;
	
	public PancakeHouseMenuIterator (List<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (position >=menuItems.size() || menuItems.get(position)==null) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		MenuItem menuItem = menuItems.get(position);
		position++;
		return menuItem;
	}

}
