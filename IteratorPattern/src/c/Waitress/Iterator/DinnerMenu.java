package c.Waitress.Iterator;

public class DinnerMenu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinnerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("ä�������ڿ� BLT","��� ���� (�Ĺ���) ������, ����, �丶�並 ���� �޴�",true,2.99);
		addItem("BLT","��� ���� ������, ����, �丶�並 ���� �޴�",false,2.99);
		addItem("������ ����","���� �����带 ����� ������ ����",false,3.29);
		addItem("�ֵ���","���ũ���Ʈ, ���� ���, ����, ġ� ��鿩�� �ֵ���",false,3.05);		
	}
		
	public void addItem(String name, String description, boolean vegiterian, double price) {
		MenuItem menuItem = new MenuItem(name,description,vegiterian,price);
	if (numberOfItems > MAX_ITEMS) {
		System.out.println("�˼��մϴ�. �޴��� �� á���ϴ�. �� �̻� �߰��� �� �����ϴ�.");
	}
		menuItems[numberOfItems] = menuItem;
		numberOfItems++;
	}

	public MenuItem[] getMenuItems() {
		return menuItems;
	}
}