// 3. Write a Java program to create a generic method that takes a list of any type and a target element. It returns the index of the first occurrence of the target element in the list. Return -1 if the target element cannot be found.

import java.util.List;

class Main3 {

	public static <T> int findElementIndex(List<T> list, T target) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(target)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {}
}
