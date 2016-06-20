class FindmaxElement
{
  static class Tree
  {
    int data;
    Tree left;
    Tree right;
    Tree(int data)
    {
      this.data=data;
      this.left=null;
      this.right=null;
    }
  }

  public static void main(String[] args) {
    Tree root = new Tree(11);
    root.left=new Tree(21);
    root.right=new Tree(3);
    root.left.left=new Tree(14);
    root.left.right=new Tree(5);
    root.right.left=new Tree(16);
    root.right.right=new Tree(7);
    System.out.println("Max Element in the Tree is :: "+findMax(root));
  }

  static int findMax(Tree root )
  {
    if (root==null)
      return -1;
    int max=0;
    int left= findMax(root.left);
    int right= findMax(root.right);
    if(left>=right)
        max=left;
    else
        max=right;
    if(root.data> max)
      max=root.data;
      return max;
  }
}
