package c.CoffeineBeverageWithHook;

import java.util.Scanner;

public class Tea extends CaffeineBeverageWithHook {

	@Override
	public void brew() {
		// TODO Auto-generated method stub
		System.out.println("���� ������� ��");
	}

	@Override
	public void addCodiments() {
		// TODO Auto-generated method stub
		System.out.println("������ �߰��ϴ� ��");
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
		System.out.println("���� ������ �־�帱���? (y/n)");
		Scanner scanner = new Scanner(System.in);
		answer = scanner.nextLine();
		
		return answer;
	}

}
