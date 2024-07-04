import java.util.Random;

class Main {

	public static void main(String[] args) {
		Random rand = new Random();

		Stack<Integer> stack = new Stack<>(10);

		for (int i = 0; i < 10; i++) stack.push(rand.nextInt(1000));

		stack.print(); // Output: 1 2 3 4 5 6 7 8 9 10
		stack.sort();
		stack.print(); // Output: 1 2
		stack.sort("descending");
		stack.clear();
		stack.print(); // Output: 1 2
	}
}
