import java.util.*;
class LCA
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
    tree.left.right=new Node(5);
    tree.right= new Node(3);
    tree.right.left=new Node(6);
    tree.right.right=new Node(7);
    print(tree);
    System.out.println("LCA(4,5)="+LCA(tree,4,5).data);
    System.out.println("LCA(4,6)="+LCA(tree,4,6).data);
    System.out.println("LCA(3,4)="+LCA(tree,3,4).data);

  }

static Node LCA(Node root, int a , int b)
{
  if(root==null)
    return null;
  if(root.data==a || root.data==b)
    return root;
Node left =  LCA(root.left,a,b);
Node right=  LCA(root.right,a,b);
if (left!=null && right!=null)
return root;
return (left!=null)? left:right;
}


  static void print(Node root)
  {
    Queue<Node> queue = new LinkedList<Node>();
    queue.add(root);
    while(!queue.isEmpty())
    {
      Node node = queue.remove();
      System.out.println(node.data);
      if (node.left!=null)
      queue.add(node.left);
      if(node.right!=null)
      queue.add(node.right);

    }

  }
}
