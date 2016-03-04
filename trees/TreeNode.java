package trees;



public class TreeNode {
	public int data;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int data) {
		this.data = data;
		left = right = null;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getData() {
		return this.data;
	}

	public void setLeft(TreeNode node) {
		this.left = node;
	}

	public TreeNode getLeft() {
		return this.left;
	}

	public void setRight(TreeNode node) {
		this.right = node;
	}

	public TreeNode getRight() {
		return this.right;
	}
}
