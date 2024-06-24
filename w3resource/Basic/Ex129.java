/*
129. Write a Java program to find a number that appears only once in a given array of integers. All numbers occur twice.
Source Array : [10, 20, 10, 20, 30, 40, 40, 30, 50] 50 appears only once
*/
import java.util.HashMap;

class Ex129 {

	public static void main(String args[]) {
		int[] nums = { 10, 20, 10, 20, 30, 40, 40, 30, 50 };

		System.out.println(getSingleNumber(nums));
	}

	private static int getSingleNumber(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i : arr) if (map.containsKey(i)) map.put(i, map.get(i) + 1);
		else map.put(i, 1);

		//System.out.println(map);

		int singleNumber = -1;
		for (Integer i : map.keySet()) {
			singleNumber = i;
			break;
		}

		return singleNumber;
	}
}
