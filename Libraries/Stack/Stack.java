public class Stack {

    int[] data;
    int top;
    int size;

    Stack(int size) {
        this.size = size;
        data = new int[size];
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    void push(int obj) {
        if (!isFull()) {
            data[++top] = obj;
        }
    }

    void pop() {
        if (!isEmpty()) {
            top--;
        }
    }

    int peek() {
        return data[top];
    }

    void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(data[i]);
        }
    }
}
