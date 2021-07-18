package c.Waitress.Iterator;

import java.util.Iterator;
import java.util.List;

public class Waitress {
	PancakeHouseMenu pancakeHouseMenu;
	DinnerMenu dinnerMenu;

	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinnerMenu = dinnerMenu;
	}
	public void printMenu() {
		Iterator pancakeHouseMenuIterator = pancakeHouseMenu.iterator();
		Iterator dinnerMenuIterator = dinnerMenu.iterator();
		System.out.println("�޴�");
		System.out.println("---��ħ�޴�");
		printMenu(pancakeHouseMenuIterator);
		System.out.println("---���ɸ޴�");
		printMenu(dinnerMenuIterator);
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
