// 7. Write a Java program to create a generic method that takes a map of any type and prints each key-value pair.
//
import java.util.HashMap;
import java.util.Map;

public class Main7 {

	public static <K, V> void printMap(Map<K, V> map) {
		for (Map.Entry<K, V> entry : map.entrySet()) {
			K key = entry.getKey();
			V value = entry.getValue();
			System.out.println("Key: " + key + ", Value: " + value);
		}
	}

	public static void main(String[] args) {
		Map<String, Integer> colorMap = new HashMap<>();
		colorMap.put("Red", 1);
		colorMap.put("Green", 2);
		colorMap.put("Blue", 3);

		System.out.println("Color Map:");
		printMap(colorMap);

		Map<String, String> capitalMap = new HashMap<>();
		capitalMap.put("Germany", "Berlin");
		capitalMap.put("USA", "Washington, D.C.");
		capitalMap.put("UK", "London");
		capitalMap.put("France", "Paris");

		System.out.println("\nCapital Map:");
		printMap(capitalMap);
	}
}
