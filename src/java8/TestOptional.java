package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestOptional {

	public static void main(String[] args)

	{
		List<Integer> lst = new ArrayList<>(Arrays.asList(6, 9, 3, 2, 4));
		printList(lst);

	}

	private static void printList(List<Integer> lst) {
/*		if (lst != null) {
			for (int i = 0; i < lst.size(); i++) {
				int element = lst.get(i);
				System.out.println(element);

			}
		} else
			System.out.println("passed list is null");*/

		
		Optional<List<Integer>> op =  Optional.of(lst);
		if(op.isPresent())
		{
			for (int i = 0; i < lst.size(); i++) {
				int element = lst.get(i);
				System.out.println(element);

			}
		}
		else
		{
				System.out.println("passed list is null");
		}
	}
	

}
