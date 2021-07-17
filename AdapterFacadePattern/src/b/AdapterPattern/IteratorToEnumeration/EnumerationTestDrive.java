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

		//Test 코드를 어떻게 실행해야 하는지 모르겠음...
		List<String> testWords = new ArrayList<String>();
		testWords.add("one");
		testWords.add("two");
		testWords.add("three");
		testWords.add("four");
		testWords.add("five");
		// 모든 컬렉션 안에는 iterator 메소드가 들어있음.
		Iterator<String> itr = testWords.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		
	}

}
