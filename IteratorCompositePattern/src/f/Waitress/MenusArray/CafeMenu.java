package f.Waitress.MenusArray;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {
	Hashtable menuItems = new Hashtable();

	public CafeMenu() {
		addItem("���� ���ſ� ���� ������", "��л�,����,�丶��,����Ƣ���� ÷���� ���� ����", true, 3.99);
		addItem("������ ����", "�����尡 ������ ������ ����", false, 3.69);
		addItem("������", "�� ������� ���, ����ī���� ��鿩�� Ǫ���� ������", true, 4.29);
	}

	public void addItem(String name, String description, boolean vegiterian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegiterian, price);
		menuItems.put(menuItem.getName(), menuItem);
	}
	
	public Hashtable getItems() {
		return menuItems;
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub	
		return menuItems.values().iterator();
	}

}
