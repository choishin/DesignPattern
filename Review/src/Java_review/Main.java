package Java_review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	
	public static void main (String[] args) {
		//int,long,short,char,boolean... (�ҹ��ڷ� �����ϴ� Ÿ�Ե�)
		//primitive type => ���� ����
		//�̰� ������ �������� reference type => �ּҸ� ����
		//���� ���� null�� ������ ���� �޸𸮿��� ���������� ��. (������ ���°�)
		//String�� ������ �ʴ´�.
		
		List<String> items = new ArrayList<String>();
		items.add("��");
		items.add("��");
		items.add("��");

		Collections.sort(items);
		System.out.println(items);
		Collections.reverse(items);
		System.out.println(items);
		
		
		List<Hero> heros = new ArrayList<Hero>();
		heros.add(new Hero("ȫ�浿",10));
		heros.add(new Hero("���۸�",50));
		heros.add(new Hero("��Ʈ��",80));
		Collections.sort(heros);
		Collections.sort(heros, new Comparator<Hero>() {

			@Override
			public int compare(Hero hero, Hero hero2) {
				// TODO Auto-generated method stub
				return 0;
			}
						
		});
		System.out.println(heros);
		
		

	}


}
