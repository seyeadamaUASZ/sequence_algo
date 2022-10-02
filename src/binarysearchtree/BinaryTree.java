package binarysearchtree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	private Node root;

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		root = null;
	}

	public BinaryTree(int key) {
		// TODO Auto-generated constructor stub
		root = new Node(key);
	}

	void printNodes(Node root, int start, int end) {
		if (root == null) {
			return;
		}
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		Node current = null;

		int level = 0;
		while (!queue.isEmpty()) {
			level++;

			int size = queue.size();

			while (size != 0) {
				current = queue.peek();
				queue.poll();
				if (level >= start && level <= end) {
					System.out.print(current.key + " ");
				}
				if (current.left != null) {
					queue.add(current.left);
				}

				if (current.right != null) {
					queue.add(current.right);
				}
				size--;

			}
			if (level >= start && level <= end) {
				System.out.println("");
			}
		}
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		tree.root = new Node(1);

		/*
		 * 1
		 * / \
		 * null null
		 * 
		 */

		tree.root.left = new Node(2);
		tree.root.right = new Node(3);

		/*
		 * 1
		 * / \
		 * 2 3
		 * / \ / \
		 * null null null null
		 * 
		 */
		tree.root.left.left = new Node(4);
		tree.root.right.right = new Node(5);

		/*
		 * 1
		 * / \
		 * 2 3
		 * / \ / \
		 * 4 5 null null
		 * / \
		 * null null
		 * 
		 */
		System.out.println("binary tree");

		tree.printNodes(tree.root, 1, 3);
	}

}
