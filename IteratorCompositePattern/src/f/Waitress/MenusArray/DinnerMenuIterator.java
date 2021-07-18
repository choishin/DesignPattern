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
	
	//remove가 호출되면 모든 항목들을 한칸씩 왼쪽으로 밀어줘야 함
	public void remove() {
		if (position <=0) {
			throw new IllegalStateException("next()를 한번도 호출하지 않은 상태에서는 삭제 할 수없습니다.");
		}
		//position 자리의 것을 없애줄 것임.
		if (menuItems[position-1] != null) {
			for (int i=position-1; i>menuItems.length-1; i++)
			//menuItems[position]자리에 menuItems[position+1]의 값이 오게 됨
			menuItems[position] = menuItems[position+1];
		}
		//맨끝의 값은 없애기!
		menuItems[menuItems.length-1] = null;
	}
}
