class PreOrdertraveral
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
    Tree root = new Tree(1);
    root.left=new Tree(2);
    root.right=new Tree(3);
    root.left.left=new Tree(4);
    root.left.right=new Tree(5);
    root.right.left=new Tree(6);
    root.right.right=new Tree(7);
    PreOrder(root);
  }

  static void PreOrder(Tree root)
  {
    if(root==null)
      return;
    System.out.println(""+root.data);
    PreOrder(root.left);
    PreOrder(root.right);
  }
}
