package d.ArrayDucks;

import java.util.Arrays;

public class DuckSortTestDrive {
	public static void main (String[] args) {
		Duck[] ducks = { new Duck("Daffy",8),
						new Duck("Dewey",2),
						new Duck("Howard",7),
						new Duck("Louise",2),
						new Duck("Donald",10),
						new Duck("Huey",2)
		};
		
		System.out.println("정렬전 : ");
		display(ducks);
		//Duck에 정의한 compareTo 메소드를 호출하려면 Arrays.sort(객체)
		Arrays.sort(ducks);
		System.out.println("정렬후 : ");
		display(ducks);
	}
	
	public static void display(Duck[] ducks) {
		for(int i=0; i<ducks.length; i++) {
			System.out.println(ducks[i]);
		}
	}

	
}
