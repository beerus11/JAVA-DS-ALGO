import java.util.*;
class FindLeavesCount
{
  static class Node{
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
    System.out.println("Total Leaves Count is :: "+getLeavesCount(tree));
  }

  static int getLeavesCount(Node root)
  {
    Queue<Node> queue= new LinkedList<Node>();
    queue.add(root);
    int count=0;
    while(!queue.isEmpty())
    {
      Node temp= queue.remove();
      if(temp.left==null && temp.right==null)
        count++;
      if(temp.left!=null)
        queue.add(temp.left);
      if(temp.right!=null)
        queue.add(temp.right);

    }
    return count;
  }
}
