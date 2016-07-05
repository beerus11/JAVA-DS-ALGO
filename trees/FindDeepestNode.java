import java.util.*;
class FindDeepestNode
{
  static class Node
  {
    int data;
    Node left;
    Node right;
    Node(int data)
    {
      this.data=data;
      left=right=null;
    }
  }
  public static void main(String[] args) {
    Node tree = new Node(1);
    tree.left=new Node(2);
    tree.left.left=new Node(4);
    tree.right=new Node(3);
    tree.right.left=new Node(5);
    tree.right.left.right=new Node(7);
    tree.right.left.right.left=new Node(9);
    tree.right.right=new Node(6);
    tree.right.right.right=new Node(8);
    tree.right.right.right.right=new Node(10);
    System.out.println("Deepest Node is :: "+deepestNode(tree).data);
  }

  static Node deepestNode(Node root)
    {
      Node temp=null;
      Queue<Node> queue = new LinkedList<Node>();
      queue.add(root);
      while(!queue.isEmpty())
      {
        temp = queue.remove();
        if(temp.left!=null)
          queue.add(temp.left);
        if(temp.right!=null)
          queue.add(temp.right);

      }
      return temp;
  }


  static void print(Node root)
  {
    Queue<Node> queue = new LinkedList<Node>();
    queue.add(root);
    while(!queue.isEmpty())
    {
      Node temp = queue.remove();
      System.out.println(""+temp.data);
      if(temp.left!=null)
        queue.add(temp.left);
      if(temp.right!=null)
        queue.add(temp.right);

    }
  }

}
