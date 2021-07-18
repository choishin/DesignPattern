package g.Waitress.Composite;

import java.util.Iterator;

public class MenuTestDrive {
	public static void main(String[] args) {
		MenuComponent allMenus = new Menu("��ü �޴�", "��ü �޴�");				
		MenuComponent pancakeHouseMenu = new Menu("������ũ �Ͽ콺 �޴�", "��ħ �޴�");
		MenuComponent dinnerMenu = new Menu("��ü���� �Ĵ� �޴�", "���� �޴�");
		MenuComponent cafeMenu = new Menu("ī�� �޴�", "���� �޴�");
		MenuComponent dessertMenu = new Menu("����Ʈ �޴�", "����Ʈ�� ��ܺ�����!");

		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinnerMenu);
		allMenus.add(cafeMenu);
		allMenus.add(dessertMenu);
		
		MenuComponent oldPancakeHouseMenu = new PancakeHouseMenu();
		MenuComponent oldDinnerMenu = new DinnerMenu();
		MenuComponent oldCafeMenu = new CafeMenu();
		
		Iterator pancakeIterator = oldPancakeHouseMenu.createIterator();
		while (pancakeIterator.hasNext()) {
			MenuItem menuItem = (MenuItem)pancakeIterator.next();
			pancakeHouseMenu.add(menuItem);
		}
		
		Iterator dinnerIterator = oldDinnerMenu.createIterator();
		while(dinnerIterator.hasNext()) {
			MenuItem menuItem = (MenuItem)dinnerIterator.next();
			dinnerMenu.add(menuItem);
		}
		
		Iterator cafeIterator = oldCafeMenu.createIterator();
		while(cafeIterator.hasNext()) {
			MenuItem menuItem = (MenuItem)cafeIterator.next();
			cafeMenu.add(menuItem);
		}
				
		dinnerMenu.add(new MenuItem("�Ľ�Ÿ","�������� �ҽ� ���İ�Ƽ. ȿ�𻧵� �帳�ϴ�",true,3.89));
		dessertMenu.add(new MenuItem("��������","�ٻ�ٻ��� ũ����Ʈ�� �ٴҶ� ���̽�ũ���� ���� �ִ� ��������",true,1.59));
		
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
	}

}
