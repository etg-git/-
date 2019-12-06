package BinarySearchTree;

import java.util.LinkedList;

public class Q1 {
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		int n[] = { 50, 20, 70, 10, 30, 5, 15, 25, 60, 90, 62, 65, 64, 35 };
		for (int i = 0; i < n.length; i++)
			tree.add(n[i]);
		System.out.println(tree.search(30));
		System.out.println(tree.search(33));
		System.out.println(tree);
		System.out.println(BinarySearchTree.inorder(tree.root));
	}
}

class BinarySearchTree {
	class BinaryTree {
		int key;
		BinaryTree left, right;

		public BinaryTree(int key) {
			this.key = key;
		}

		@Override
		public String toString() {
			return Integer.toString(key);
		}
	}

	BinaryTree root;
// #2¹ø 
	public void add(int key) {

		BinaryTree tree = new BinaryTree(key);
		if (root == null) {
			root = tree;
		} 
		else {
			BinaryTree node = root;
			BinaryTree parent;
			while (root != null) {
				parent = node;

				if (node.key < key) {
					node = node.right;
					if (node == null) {
						parent.right = tree;

						return;
					}

				} else if (node.key > key) {
					node = node.left;
					if (node == null) {
						parent.left = tree;

						return;
					}
				}
			}
		}
	}
// #1¹ø
	public BinaryTree search(int key) {
		return searchRecur(root, key);
	}

	private BinaryTree searchRecur(BinaryTree node, int key) {
		if (node == null)
			return null;

		if (node.key < key)
			return searchRecur(node.right, key);

		else if (node.key > key)
			return searchRecur(node.left, key);

		return node;
	}
// # 3¹ø
	public static String inorder(BinaryTree tree) {
		if (tree == null)
			return "";

		return inorder(tree.left) + " " + tree.key + " " + inorder(tree.right);

	}

	@Override
	public String toString() {
		return levelOrder().toString();
	}

	private LinkedList<BinaryTree> levelOrder() {
		LinkedList<BinaryTree> list = new LinkedList<>();
		LinkedList<BinaryTree> queue = new LinkedList<>();
		if (root != null)
			queue.addLast(root);
		while (!queue.isEmpty()) {
			BinaryTree node = queue.removeFirst();
			list.add(node);
			if (node.left != null)
				queue.addLast(node.left);
			if (node.right != null)
				queue.addLast(node.right);
		}
		return list;
	}
}