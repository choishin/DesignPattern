package c.Waitress.Iterator;

import java.util.Iterator;

import d.Waitress.addRemove.DinnerMenuIterator;

public class DinnerMenu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinnerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("채식주의자용 BLT","통밀 위에 (식물성) 베이컨, 상추, 토마토를 얹은 메뉴",true,2.99);
		addItem("BLT","통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴",false,2.99);
		addItem("오늘의 스프","감자 샐러드를 곁들인 오늘의 스프",false,3.29);
		addItem("핫도그","사워크라우트, 갖은 양념, 양파, 치즈가 곁들여진 핫도그",false,3.05);		
	}
		
	public void addItem(String name, String description, boolean vegiterian, double price) {
		MenuItem menuItem = new MenuItem(name,description,vegiterian,price);
	if (numberOfItems > MAX_ITEMS) {
		System.out.println("죄송합니다. 메뉴가 꽉 찼습니다. 더 이상 추가할 수 없습니다.");
	}
		menuItems[numberOfItems] = menuItem;
		numberOfItems++;
	}

	public Iterator iterator() {
		
		return new DinnerMenuIterator(menuItems);
	}
}
