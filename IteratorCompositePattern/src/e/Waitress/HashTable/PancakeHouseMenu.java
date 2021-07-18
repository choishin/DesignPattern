package e.Waitress.HashTable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu{
	List<MenuItem> menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList();
		addItem("K&B ������ũ ��Ʈ","��ũ����� ���׿� �佺Ʈ�� ��鿩�� ������ũ",true,2.99);
		addItem("���ַ� ������ũ ��Ʈ","�ް� �Ķ��̿� �ҽ����� ��鿩�� ������ũ",false,2.99);
		addItem("��纣�� ������ũ","�ż��� ��纣���� ��纣�� �÷����� ���� ������ũ",true,3.49);
		addItem("����","���� ���⿡ ���� ��纣���� ���⸦ ���� �� �ֽ��ϴ�.",true,3.59);
	}
	
	public void addItem(String name, String description, boolean vegiterian, double price) {
		MenuItem menuItem = new MenuItem(name,description,vegiterian,price);
		menuItems.add(menuItem);
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return menuItems.iterator(); 
	}
	
}
