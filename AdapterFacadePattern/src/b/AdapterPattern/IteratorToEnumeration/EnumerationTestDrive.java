package b.AdapterPattern.IteratorToEnumeration;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class EnumerationTestDrive {
	public static void main(String[] args) {

		EnumeraionImpl enumerationImpl = new EnumeraionImpl();
		IteratorImpl iteratorImpl = new IteratorImpl();
		Enumeration iteratorAdapter = new IteratorAdapter(iteratorImpl);
		Iterator enumerationAdapter = new EnumerationAdapter(enumerationImpl);

		//Test �ڵ带 ��� �����ؾ� �ϴ��� �𸣰���...
		List<String> testWords = new ArrayList<String>();
		testWords.add("one");
		testWords.add("two");
		testWords.add("three");
		testWords.add("four");
		testWords.add("five");
		// ��� �÷��� �ȿ��� iterator �޼ҵ尡 �������.
		Iterator<String> itr = testWords.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		
	}

}
