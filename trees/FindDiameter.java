class FindDiameter
{
  static class Tree
  {
    int data;
    Tree left;
    Tree right;
    Tree(int data)
    {
      this.data=data;
      left=right=null;
    }
  }

  public static void main(String[] args) {
    Tree tree = new Tree(1);
    tree.left = new Tree(2);
    tree.right = new Tree(3);
    tree.left.left = new Tree(4);
    tree.left.right = new Tree(5);
    System.out.println("Diameter :: "+diameter(tree));
  }

static  int diameter(Tree root)
    {
        /* base case if tree is empty */
        if (root == null)
            return 0;
        int lheight = height(root.left);
        int rheight = height(root.right);
        int ldiameter = diameter(root.left);
        int rdiameter = diameter(root.right);
        return Math.max(lheight + rheight + 1,Math.max(ldiameter, rdiameter));
    }

  static int height(Tree node)
    {
        /* base case tree is empty */
        if (node == null)
            return 0;
        return (1 + Math.max(height(node.left), height(node.right)));
    }
}
