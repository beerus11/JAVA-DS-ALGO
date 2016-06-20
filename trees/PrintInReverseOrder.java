import java.util.*;
class PrintInReverseOrder{
  static class Tree{
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
    printInReverseOrder(root);
  }

  static void printInReverseOrder(Tree root)
  {
    Stack<Tree> stack = new Stack<Tree>();
    Queue<Tree> queue = new LinkedList<Tree>();
    if(root==null) return;
    queue.add(root);
    while(!queue.isEmpty())
    {
      Tree node = queue.remove();
      if(node.left!=null)
        queue.add(node.left);
      if(node.right!=null)
        queue.add(node.right);
      stack.push(node);
    }
    System.out.println("Stack after Reversal");
    while(!stack.empty())
    {
      System.out.println(""+stack.pop().data);
    }
  }
}
