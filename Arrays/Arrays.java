public class Arrays {

	public static void main(String args[]) {
		String[] cars = { "Skoda", "Audi" };

		for (String i : cars) System.out.println(i);

		System.out.println(cars.length);

		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

		// Matrici

		int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
		System.out.println(myNumbers[1][2]); // Outputs 7

		myNumbers[1][2] = 9;
		System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7

		for (int[] row : myNumbers) {
			for (int i : row) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
