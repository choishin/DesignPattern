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
		
		System.out.println("�޴�");
		System.out.println("---\n��ħ�޴�");
		printMenu(pancakeHouseMenuIterator);
		System.out.println("---\n���ɸ޴�");
		printMenu(dinnerMenuIterator);
		System.out.println("---\n����޴�");
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

	//������ �޼ҵ嵵 �� ����ϰ� �ΰ��� ���� ���� ��ȯ���� ������ �ڷḦ �̾Ƴ��� �� -> �̰� ����
	void printBreakfastMenu() {}
	void printLunchMenu() {}
	void printVegiterianMenu() {}
	boolean isItemVegiterian(String name) {
		return false;
	}
	
}
