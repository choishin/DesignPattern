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
	//나머지 메소드도 다 비슷하게 두개의 가게 각각 순환문을 돌려서 자료를 뽑아내게 됨 -> 이게 문제
	void printBreakfastMenu() {}
	void printLunchMenu() {}
	void printVegiterianMenu() {}
	boolean isItemVegiterian(String name) {
		return false;
	}
	
}
