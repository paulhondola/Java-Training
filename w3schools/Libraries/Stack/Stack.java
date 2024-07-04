import java.math.BigInteger;
import java.util.LinkedList;

public class Stack<T> {

	private LinkedList<T> data;
	private int top;
	private int size;

	public Stack(int size) {
		data = new LinkedList<>();
		this.size = size;
		top = -1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == size - 1;
	}

	public void push(T obj) {
		if (!isFull()) {
			top++;
			data.add(obj);
		}
	}

	public T pop() {
		if (!isEmpty()) {
			T obj = data.get(top);
			data.remove(top);
			top--;
			return obj;
		}
		return null; // or throw an exception
	}

	public T peek() {
		if (!isEmpty()) {
			return data.get(top);
		}
		return null; // or throw an exception
	}

	public void print() {
		for (T item : data) System.out.print(item + " ");
		System.out.println();
	}

	public void sort() {
		Stack<T> tempStack = new Stack<>(size);
		while (!isEmpty()) {
			T temp = pop();
			while (
				!tempStack.isEmpty() && tempStack.peek().toString().compareTo(temp.toString()) < 0
			) {
				push(tempStack.pop());
			}
			tempStack.push(temp);
		}

		while (!tempStack.isEmpty()) push(tempStack.pop());
	}

	public void sort(String opt) {
		if (opt.equals("ascending")) {
			sort();
		} else if (opt.equals("descending")) {
			Stack<T> tempStack = new Stack<>(size);
			while (!isEmpty()) {
				T temp = pop();
				while (
					!tempStack.isEmpty() &&
					tempStack.peek().toString().compareTo(temp.toString()) > 0
				) {
					push(tempStack.pop());
				}
				tempStack.push(temp);
			}

			while (!tempStack.isEmpty()) push(tempStack.pop());
		} else {
			System.out.println("Invalid option");
		}
	}

	public void reverse() {
		Stack<T> tempStack = new Stack<>(size);
		while (!isEmpty()) {
			tempStack.push(pop());
		}
		while (!tempStack.isEmpty()) {
			push(tempStack.pop());
		}
	}

	public T getMin() {
		T min = data.get(0);
		for (T item : data) {
			if (item.toString().compareTo(min.toString()) < 0) {
				min = item;
			}
		}
		return min;
	}

	public T getMax() {
		T max = data.get(0);
		for (T item : data) {
			if (item.toString().compareTo(max.toString()) > 0) {
				max = item;
			}
		}
		return max;
	}

	public void clear() {
		data.clear();
		top = -1;
	}

	public int getSize() {
		return size;
	}

	public int getTop() {
		return top;
	}

	public boolean contains(T obj) {
		return data.contains(obj);
	}
}
