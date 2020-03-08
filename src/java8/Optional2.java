package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Optional2 {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>(Arrays.asList("java", "javac", "C++", "Algorithm", "DesignPattern"));

		String found = findFirst(lst, "ja");
		
		long l = count(lst,"ja");
		System.out.println("number of books "+l);
		System.out.println(found);

	}

	private static long count(List<String> lst, String string) 
	{
		return lst.stream().filter(l->l.startsWith(string)).count();
	}

	private static String findFirst(List<String> lst, String str) {
		String book = null;
		/*
		 * for (String string : lst) { if(string.startsWith(str)) { book=
		 * string; break; } }
		 */

		Optional<String> op = lst.stream().filter((s) -> s.startsWith(str)).findFirst();
		// Optional<String> op = Optional.ofNullable(book);
		// return book!=null?book:"Not found";
		return op.orElse("NotFound");

	}

}
