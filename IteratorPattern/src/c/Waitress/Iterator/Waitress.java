package c.Waitress.Iterator;

import java.util.Iterator;
import java.util.List;

public class Waitress {

	void printMenu() {
		PancakeHouseMenu pancakeHouse = new PancakeHouseMenu();
		DinnerMenu dinner = new DinnerMenu();
		
		List<MenuItem> pancakeHouseMenu = pancakeHouse.getMenuItems();
		MenuItem[] dinnerMenu = dinner.getMenuItems();
		
		Iterator iterator = pancakeHouseMenu.iterator();
	}
	//������ �޼ҵ嵵 �� ����ϰ� �ΰ��� ���� ���� ��ȯ���� ������ �ڷḦ �̾Ƴ��� �� -> �̰� ����
	void printBreakfastMenu() {}
	void printLunchMenu() {}
	void printVegiterianMenu() {}
	boolean isItemVegiterian(String name) {
		return false;
	}
	
}
