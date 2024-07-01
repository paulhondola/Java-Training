// Write a Java program to create a generic method that takes two arrays of the same type and checks if they have the same elements in the same order.

import java.util.Arrays;

class Main1 {

	public static <T> boolean checkArray(T[] array1, T[] array2) {
		if (array1.length != array2.length) {
			return false;
		}

		for (int i = 0; i < array1.length; i++) {
			if (!array1[i].equals(array2[i])) {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {
		Integer[] array1 = { 1, 2, 3, 4, 5 };
		Integer[] array2 = { 1, 2, 3, 4, 5 };

		System.out.println(checkArray(array1, array2));

		String[] array3 = { "a", "b", "c", "d", "e" };
		String[] array4 = { "d", "b", "c", "d", "e" };

		System.out.println(checkArray(array3, array4));
	}
}
