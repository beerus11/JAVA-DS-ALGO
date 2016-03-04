import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import trees.BinaryTree;
import trees.BinaryTree.Node;
import trees.TreeNode;

public class BinaryTreeTest {
	public static void main(String arg[]) {
		TreeNode root = new TreeNode(1);
		root.setLeft(new TreeNode(2));
		root.setRight(new TreeNode(3));
		root.getLeft().setLeft(new TreeNode(4));
		root.getLeft().setRight(new TreeNode(5));
		root.getRight().setLeft(new TreeNode(6));
		root.getRight().setRight(new TreeNode(7));
		// insertNode(99, root);
		// printLevelOrder(root);
		System.out.println("Leaves ::" + noOfLeaves(root));
	}

	public static void insertNode(int data, TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		TreeNode node = new TreeNode(data);
		while (!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			if (temp.getLeft() != null)
				queue.add(temp.getLeft());
			else {
				temp.setRight(node);
				return;
			}
			if (temp.getRight() != null)
				queue.add(temp.getRight());
			else {
				temp.setRight(node);
				return;
			}
		}
	}

	public static void printLevelOrder(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode tempNode = queue.poll();
			System.out.println(tempNode.getData());
			if (tempNode.getLeft() != null)
				queue.add(tempNode.getLeft());
			if (tempNode.getRight() != null)
				queue.add(tempNode.getRight());

		}
	}

	public static int noOfLeaves(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		int count = 0;
		while (!queue.isEmpty()) {
			TreeNode tempNode = queue.poll();
			if (tempNode.getRight() == null && tempNode.getLeft() == null)
				++count;
			if (tempNode.getLeft() != null)
				queue.add(tempNode.getLeft());
			if (tempNode.getRight() != null)
				queue.add(tempNode.getRight());

		}
		return count;
	}

	public static int noFullNode(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		int count = 0;
		while (!queue.isEmpty()) {
			TreeNode tempNode = queue.poll();
			if (tempNode.getRight() != null && tempNode.getLeft() != null)
				++count;
			if (tempNode.getLeft() != null)
				queue.add(tempNode.getLeft());
			if (tempNode.getRight() != null)
				queue.add(tempNode.getRight());

		}
		return count;
	}

	public static int noHalfNode(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		int count = 0;
		while (!queue.isEmpty()) {
			TreeNode tempNode = queue.poll();
			if (tempNode.getRight() == null || tempNode.getLeft() != null)
				++count;
			if (tempNode.getRight() != null || tempNode.getLeft() == null)
				++count;
			if (tempNode.getLeft() != null)
				queue.add(tempNode.getLeft());
			if (tempNode.getRight() != null)
				queue.add(tempNode.getRight());

		}
		return count;
	}

	public static Boolean isSimilar(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null)
			return true;
		if (root1 == null && root2 == null)
			return false;
		if ((root1.getData() == root2.getData())
				&& isSimilar(root1.getLeft(), root2.getLeft())
				&& isSimilar(root1.getRight(), root2.getRight())) {
			return true;
		}
		return false;

	}

	public static int Diameter(Node root, int diameter) {
		int left, right;
		if (root == null)
			return 0;
		left = Diameter(root.getLeft(), diameter);
		right = Diameter(root.getRight(), diameter);
		if (left + right > diameter)
			diameter = left + right;
		return Math.max(left, right) + 1;

	}
}
