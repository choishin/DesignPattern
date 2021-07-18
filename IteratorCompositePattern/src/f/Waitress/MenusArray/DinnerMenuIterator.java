package f.Waitress.MenusArray;

import java.util.Iterator;

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
	
	//remove�� ȣ��Ǹ� ��� �׸���� ��ĭ�� �������� �о���� ��
	public void remove() {
		if (position <=0) {
			throw new IllegalStateException("next()�� �ѹ��� ȣ������ ���� ���¿����� ���� �� �������ϴ�.");
		}
		//position �ڸ��� ���� ������ ����.
		if (menuItems[position-1] != null) {
			for (int i=position-1; i>menuItems.length-1; i++)
			//menuItems[position]�ڸ��� menuItems[position+1]�� ���� ���� ��
			menuItems[position] = menuItems[position+1];
		}
		//�ǳ��� ���� ���ֱ�!
		menuItems[menuItems.length-1] = null;
	}
}
