import java.util.*;
class FindmaxElementI
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
    Queue<Tree> queue = new LinkedList<Tree>();
    queue.add(root);
    int max=-1;
    while(!queue.isEmpty())
    {
      Tree node = queue.remove();
      max=Math.max(max,node.data);
      if(node.left!=null)
           queue.add(node.left);
      if(node.right!=null)
           queue.add(node.right);
    }
    return max;
  }
}
