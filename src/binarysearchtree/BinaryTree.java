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

	// method affiche des elements d'un tableau de taille

	static void printArr(int array[], int taille) {
		for (int i = 0; i < taille; i++) {
			System.out.println("sum level " + (i + 1) + " : " + array[i]);
		}
	}

	// avoir la hauteur de l'arbre
	static int getHeight(Node root) {
		if (root.left == null && root.right == null) {
			return 0;
		} else {
			int left = 0;
			int right = 0;
			if (root.left != null) {
				left = getHeight(root.left);
			}

			if (root.right != null) {
				right = getHeight(root.right);
			}

			return Math.max(left, right) + 1;

		}
	}

	// methode de calcul de la somme des noeuds à chaque niveau

	static void calculLevelSum(Node node, int level, int[] sum) {
		if (node == null) {
			return;
		} else {
			sum[level] += node.key;

			calculLevelSum(node.left, level + 1, sum);
			calculLevelSum(node.right, level + 1, sum);
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
		tree.root.left.right = new Node(5);

		/*
		 * 1
		 * / \
		 * 2 3
		 * /\
		 * 4 5 \ / \
		 * null null null null
		 * 
		 */

		// add other

		tree.root.right.left = new Node(2);
		tree.root.right.right = new Node(3);

		/*
		 * 1
		 * / \
		 * 2 3
		 * /\ /\
		 * 4 5 2 3
		 * null null null null
		 * 
		 */
		System.out.println("binary tree");

		tree.printNodes(tree.root, 1, 3);

		// niveau
		int levels = getHeight(tree.root) + 1;
		System.out.println("level on root " + levels);
		int sum[] = new int[levels];

		calculLevelSum(tree.root, 0, sum);

		// afficher le resultat de calcul sur le tableau
		printArr(sum, levels);
	}

}
