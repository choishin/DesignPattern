package c.CoffeineBeverageWithHook;

import java.util.Scanner;

public class Coffee extends CaffeineBeverageWithHook {

	@Override
	public void brew() {
		// TODO Auto-generated method stub
		System.out.println("필터를 통해서 커피를 우려내는 중");
		
	}

	@Override
	public void addCodiments() {
		// TODO Auto-generated method stub
		System.out.println("설탕과 우유를 추가하는 중");
	}
	
	boolean customerWantsCodiments() {
		String answer = getUserInput();
		if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("ye")) {
			return true;
		}
		else {
			return false;
		}
	}

	private String getUserInput() {
		String answer ="";
		System.out.println("커피에 우유와 설탕을 넣어드릴까요? (y/n)");
		Scanner scanner = new Scanner(System.in);
		answer = scanner.nextLine();
		
		return answer;
	}
}
