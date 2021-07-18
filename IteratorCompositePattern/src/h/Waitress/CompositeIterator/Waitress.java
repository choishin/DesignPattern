package h.Waitress.CompositeIterator;

import java.util.Iterator;

public class Waitress {
	MenuComponent allMenus;

	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}

	public void printMenu() {
		allMenus.print();
	}

	public void printVegiterianMenu() {
		if (allMenus instanceof Menu) {
			Iterator iterator = allMenus.createIterator();
			System.out.println("\nVEGETERIAN MENU\n-----");
			while (iterator.hasNext()) {
				MenuComponent menuComponent = (MenuComponent)iterator.next();
				try {
					if (menuComponent.isVegiterian()) {
						menuComponent.print();
					}
				} catch (UnsupportedOperationException e) {

				}
			}

		} else {
			System.out.println("allMenus is MenuItems");
		}
	}
}
