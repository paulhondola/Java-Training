import java.util.Arrays;
import java.util.List;

class ArrayTest {

	public static void main(String[] args) {
		int[] numbers = { 3, 2, 1, 4, 5 };

		// Arrays.toString
		String numbers_str = Arrays.toString(numbers);
		System.out.println(numbers_str);

		// Arrays.sort
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));

		// Arrays.binarySearch
		int index = Arrays.binarySearch(numbers, 4);
		System.out.println(index);

		// Arrays.equals
		int[] numbers1 = { 3, 2, 1, 4, 5 };

		System.out.println(Arrays.equals(numbers, numbers1));

		// Arrays.asList
		List<int[]> list = Arrays.asList(numbers);
		System.out.println(list);
	}
}
