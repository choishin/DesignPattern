package b.Waitress;

import java.util.List;

public class Waitress {

	void printMenu() {
		PancakeHouseMenu pancakeHouse = new PancakeHouseMenu();
		DinnerMenu dinner = new DinnerMenu();
		
		List<MenuItem> pancakeHouseMenu = pancakeHouse.getMenuItems();
		MenuItem[] dinnerMenu = dinner.getMenuItems();
		
		for(int i=0; i<pancakeHouseMenu.size(); i++) {
			System.out.println(pancakeHouseMenu.get(i).getName());
			System.out.println(pancakeHouseMenu.get(i).getDescription());
			System.out.println(pancakeHouseMenu.get(i).getPrice());
		}
		for(int i=0; i<dinnerMenu.length; i++) {
			System.out.println(dinnerMenu[i].getName());
			System.out.println(dinnerMenu[i].getDescription());
			System.out.println(dinnerMenu[i].getPrice());
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
