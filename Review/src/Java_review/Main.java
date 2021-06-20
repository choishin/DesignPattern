package Java_review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	
	public static void main (String[] args) {
		//int,long,short,char,boolean... (소문자로 시작하는 타입들)
		//primitive type => 값을 저장
		//이걸 제외한 나머지는 reference type => 주소를 저장
		//만일 값에 null을 넣으면 값을 메모리에서 지워버리는 것. (참조를 끊는것)
		//String은 변하지 않는다.
		
		List<String> items = new ArrayList<String>();
		items.add("나");
		items.add("다");
		items.add("가");

		Collections.sort(items);
		System.out.println(items);
		Collections.reverse(items);
		System.out.println(items);
		
		
		List<Hero> heros = new ArrayList<Hero>();
		heros.add(new Hero("홍길동",10));
		heros.add(new Hero("슈퍼맨",50));
		heros.add(new Hero("배트맨",80));
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
