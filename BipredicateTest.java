package predicate;

import java.util.function.BiPredicate;

public class BipredicateTest {

	static BiPredicate<String, String> b1 = (String,prefix) -> String.startsWith(prefix);
	static BiPredicate<String, String> b2 = String::startsWith;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//b1.test("hi", "hello");
		//b2.test("how", "are");
		
		System.out.println(b1.test("", ""));
		System.out.println(b2.test("", ""));
		

	}

}
