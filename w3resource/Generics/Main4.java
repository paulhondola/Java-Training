// 4. Write a Java program to create a generic method that takes a list of any type and returns it as a new list with the elements in reverse order.

import java.util.ArrayList;
import java.util.List;

class Main4 {

	public static <T> List reverseList(List<T> list) {
		List<T> newList = new ArrayList<>();

		for (int i = list.size() - 1; i >= 0; i--) newList.add(list.get(i));

		return newList;
	}

	public static void main(String[] args) {
		List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7);

		List<Integer> reversed = (ArrayList<Integer>) reverseList(integers);
		System.out.println(reversed);
	}
}
