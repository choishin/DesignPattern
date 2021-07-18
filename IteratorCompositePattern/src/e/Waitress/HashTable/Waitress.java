package e.Waitress.HashTable;

import java.util.Iterator;
import java.util.List;

public class Waitress {
	Menu pancakeHouseMenu;
	Menu dinnerMenu;
	Menu cafeMenu;
	

	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu, CafeMenu cafeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinnerMenu = dinnerMenu;
		this.cafeMenu = cafeMenu;
	}
	public void printMenu() {
		Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
		Iterator dinnerMenuIterator = dinnerMenu.createIterator();
		Iterator cafeMenuIterator = cafeMenu.createIterator();
		
		System.out.println("메뉴");
		System.out.println("---\n아침메뉴");
		printMenu(pancakeHouseMenuIterator);
		System.out.println("---\n점심메뉴");
		printMenu(dinnerMenuIterator);
		System.out.println("---\n저녁메뉴");
		printMenu(cafeMenuIterator);
	}
	
	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName()+" ");
			System.out.print(menuItem.getPrice()+"--");
			System.out.println(menuItem.getDescription());
		}
	} 

	//나머지 메소드도 다 비슷하게 두개의 가게 각각 순환문을 돌려서 자료를 뽑아내게 됨 -> 이게 문제
	void printBreakfastMenu() {}
	void printLunchMenu() {}
	void printVegiterianMenu() {}
	boolean isItemVegiterian(String name) {
		return false;
	}
	
}
