import java.nio.charset.Charset;
import java.util.Scanner;

class StringTest {

	public static void main(String[] args) {
		// Strings are immutable in Java

		String name = "Hello"; // on the heap
		String name1 = "Hello"; // on the heap, name1 points to the same object as name
		String name2 = new String("Hello"); // new string object created, original string object is not modified, name points to new object

		name = name.concat(" World"); // how to modify a string
		System.out.println(name);

		// Byte strings

		char[] c_arr = { 'G', 'e', 'e', 'k', 's' };
		int[] unicode_arr = { 71, 101, 101, 107, 115 };
		byte[] b_arr = { 71, 101, 101, 107, 115 };

		String s_byte = new String(b_arr); //Geeks

		Charset cs = Charset.defaultCharset();
		String s_byte_char = new String(b_arr, cs); //Geeks
		String s = new String(b_arr, 1, 3); // eek
		// String s = new String(b_arr, 1, 3, cs); // eek

		// METHODS

		String test = "Hello World";

		// length
		System.out.println(test.length());

		// charAt
		System.out.println(test.charAt(0));

		// substring
		System.out.println(test.substring(0, 5));

		// concat
		System.out.println(test.concat("!!!"));

		// indexOf
		System.out.println(test.indexOf("World"));

		// lastIndexOf

		// equals / equalsIgnoreCase

		// compareTo -> returns 0 if equal, -1 if less, 1 if greater

		// toLowerCase / toUpperCase

		// trim -> removes leading and trailing whitespaces

		// replace
		System.out.println(test.replace("World", "Universe"));

		// contains

		// split

		String[] arr = test.split(" ");
		for (String s1 : arr) {
			System.out.println(s1);
		}

		// toCharArray
		char[] char_arr = test.toCharArray();
		for (char c : char_arr) {
			System.out.print(c + " ");
		}

		// STRING MUTABILITY -> use StringBuffer or StringBuilder

		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append(" ");
		sb.append("world");
		String message = sb.toString();
		System.out.println(message);
		// Methods
		// append
		// insert
		// replace
		// delete(int start, int end)
		// reverse
		// capacity -> returns the current capacity of the buffer -> default is 16, increases by 2x + 2 if needed
	}
}
