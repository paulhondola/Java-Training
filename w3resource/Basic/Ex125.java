class Node {

	int key;
	Node left, right;

	Node(int item) {
		// Constructor to create a new Node with the given item
		key = item;
		left = right = null;
	}
}

class BinaryTree {

	Node root;

	BinaryTree() {
		root = null;
	}

	void printPreorder(Node node) {
		if (node == null) return;

		System.out.print(node.key + " ");

		printPreorder(node.left);
		printPreorder(node.right);
	}

	void printPreorder() {
		// Wrapper method to start printing the tree in preorder
		printPreorder(root);
	}

	int getMaxDepth(Node node) {
		return 0;
	}

	int getMaxDepth() {
		return getMaxDepth(root);
	}
}

class Ex125 {

	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();

		// Create a binary tree with nodes and keys
		tree.root = new Node(55);
		tree.root.left = new Node(21);
		tree.root.right = new Node(80);
		tree.root.left.left = new Node(9);
		tree.root.left.right = new Node(29);
		tree.root.right.left = new Node(76);
		tree.root.right.right = new Node(91);

		// Display a message and initiate the preorder traversal
		System.out.println("Preorder traversal of binary tree is: ");
		tree.printPreorder();
	}
}
