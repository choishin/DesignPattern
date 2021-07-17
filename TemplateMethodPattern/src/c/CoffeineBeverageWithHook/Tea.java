package c.CoffeineBeverageWithHook;

import java.util.Scanner;

public class Tea extends CaffeineBeverageWithHook {

	@Override
	public void brew() {
		// TODO Auto-generated method stub
		System.out.println("차를 우려내는 중");
	}

	@Override
	public void addCodiments() {
		// TODO Auto-generated method stub
		System.out.println("레몬을 추가하는 중");
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
		System.out.println("차에 레몬을 넣어드릴까요? (y/n)");
		Scanner scanner = new Scanner(System.in);
		answer = scanner.nextLine();
		
		return answer;
	}

}
