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
	//나머지 메소드도 다 비슷하게 두개의 가게 각각 순환문을 돌려서 자료를 뽑아내게 됨 -> 이게 문제
	void printBreakfastMenu() {}
	void printLunchMenu() {}
	void printVegiterianMenu() {}
	boolean isItemVegiterian(String name) {
		return false;
	}
	
}
