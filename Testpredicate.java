package predicate;

import java.util.function.Predicate;

public class Testpredicate {
	
	static Predicate<String> eggs = (x) -> x.contains("eggs");
	static Predicate<String> Brown = (y) -> y.contains("brown");
	
	static Predicate<String> brownegg = (x) -> x.contains("eggs") && x.contains("brown");
	static Predicate<String> otheregg = (y) -> y.contains("eggs") && !y.contains("brown");
	
	static Predicate<String> brownEgg1 = eggs.and(Brown);
	static Predicate<String> otherEgg1 = eggs.and(Brown.negate());
	
	
	
	
	/*
	 * static Predicate<String> p1 = (x) -> {
	 * 
	 * x.isEmpty(); System.out.println(x.isEmpty());
	 * 
	 * System.out.println(x.isEmpty()); return x.isEmpty(); };
	 */
	static Predicate<String> p2 = String::isEmpty;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * p1.test(""); p2.test(""); System.out.println(p1.test(""));
		 * System.out.println(p2.test("xyz"));
		 */
		System.out.println(eggs.test("eggs"));
		System.out.println(Brown.test("brown"));
		System.out.println(eggs.test("brownegg"));
		System.out.println(Brown.test("otheregg"));
		System.out.println(eggs.test("brownegg1"));
		System.out.println(Brown.test("otheregg1"));

	}

}
