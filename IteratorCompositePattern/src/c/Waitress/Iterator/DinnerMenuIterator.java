package c.Waitress.Iterator;

import java.util.Iterator;

import d.Waitress.addRemove.MenuItem;

public class DinnerMenuIterator implements Iterator {
	MenuItem[] menuItems;
	int position = 0;

	public DinnerMenuIterator(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (position >= menuItems.length || menuItems[position]==null) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		MenuItem menuItem = menuItems[position];
		position++;
		return menuItem;
	}
}
