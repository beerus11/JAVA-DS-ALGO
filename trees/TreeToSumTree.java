import java.util.*;
class TreeToSumTree
{

  static class Node
  {
    int data;
    Node left;
    Node right;
    Node( int data)
    {
      this.data=data;
      this.left=null;
      this.right=null;
    }
  }
  public static void main(String[] args) {
    Node tree = new Node(10);
    tree.left=new Node(-2);
    tree.left.left=new Node(8);
    tree.left.right=new Node(-4);
    tree.right=new Node(6);
    tree.right.left=new Node(7);
    tree.right.right=new Node(5);
    System.out.println("Tree Before:");
    print(tree);
    System.out.println("\nTree After:");
    toSum(tree);
    print(tree);

  }
  static int toSum(Node root)
  {
    if(root==null)
        return 0;
    int a = toSum(root.left);
    int b = toSum(root.right);
    int temp=root.data;
    root.data=a+b;
    return temp+root.data;
  }

  static void print(Node root)
  {
    Queue<Node> queue = new LinkedList<Node>();
    queue.add(root);
    while(!queue.isEmpty())
    {
      Node node = queue.remove();
      System.out.println(node.data);
      if(node.left!=null)
           queue.add(node.left);
      if(node.right!=null)
           queue.add(node.right);
    }
  }
}
