package f.Waitress.MenusArray;

import java.util.Iterator;
import java.util.List;

public class Waitress {
	List<Menu> menus;
	
	public Waitress (List<Menu> menus) {
		this.menus= menus;
	}
	
	public void printMenu() {
		Iterator menusIterator = menus.iterator();
		while (menusIterator.hasNext()) {
			Menu menu = (Menu) menusIterator.next();
			printMenu(menu.createIterator());
		}
		
	}	
	void printMenu(Iterator menuIterator) {
		while(menuIterator.hasNext()) {
			MenuItem menuItem = (MenuItem)menuIterator.next();
			System.out.print(menuItem.getName()+" ");
			System.out.print(menuItem.getPrice()+"--");
			System.out.println(menuItem.getDescription());
		}
	}

}
