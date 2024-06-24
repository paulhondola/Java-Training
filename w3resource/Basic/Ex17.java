import java.util.Scanner;

class Ex17 {

	private static long ReverseNumber(long num) {
		long aux = 0;

		while (num != 0) {
			aux = 10 * aux + (num % 10);
			num /= 10;
		}

		return aux;
	}

	private static int BinarySum(int first, int second) {
		int sum = 0;

		return sum;
	}

	public static char[] ConvertToString(Integer num) {
		return num.toString().toCharArray();
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		long firstBinary, secondBinary;

		System.out.println("Input 2 binary numbers:");
		firstBinary = scanner.nextLong();
		secondBinary = scanner.nextLong();
		System.out.println(ReverseNumber(firstBinary));

		char[] arr = ConvertToString(1234);
		for (char c : arr) System.out.print(c + " ");
	}
}
