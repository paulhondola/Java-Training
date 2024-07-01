// 5. Write a Java program to create a generic method that takes two lists of the same type and merges them into a single list. This method alternates the elements of each list.

import java.util.LinkedList;
import java.util.List;

class Main5 {

	public static <T> List mergeLists(List<T> lst1, List<T> lst2) {
		int minSize = Math.min(lst1.size(), lst2.size());

		List<T> merged = new LinkedList<>();

		// merge both
		for (int i = 0; i < minSize; i++) {
			merged.add(lst1.get(i));
			merged.add(lst2.get(i));
		}

		// merge remaining first
		for (int i = minSize; i < lst1.size(); i++) merged.add(lst1.get(i));

		// merge remaining second
		for (int i = minSize; i < lst2.size(); i++) merged.add(lst2.get(i));

		return merged;
	}

	public static void main(String[] args) {
		List<Integer> lst1 = List.of(1, 2, 3, 4, 5, 1, 1, 1, 1, 1, 1, 1);
		List<Integer> lst2 = List.of(5, 5, 6, 6, 2, 0, 0, 0, 0);
		List<Integer> merged = mergeLists(lst1, lst2);

		System.out.println(merged);
	}
}
