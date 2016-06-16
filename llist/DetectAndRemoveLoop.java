class detectAndRemoveLoop
{
  static class Node {
   int data;
   Node next;
  }

  public static void main(String[] args) {
    Node node1 = new Node();
     node1.data = 1;
     Node node2 = new Node();
     node2.data = 2;
     Node node3 = new Node();
     node3.data = 3;
     Node node4 = new Node();
      node4.data = 4;
      Node node5 = new Node();
      node5.data = 5;
      Node node6 = new Node();
      node6.data = 6;
      Node node7 = new Node();
      node7.data = 7;
     node1.next = node2;
     node2.next = node3;
     node3.next = node4;
     node4.next=node5;
     node5.next=node6;
     node6.next=node7;
     node7.next=node3;
    if (detectAndRemove(node1) == true)
    {  printList(node1);  }
    else
    {System.out.println("No Loop Found"); }
  }
public  static boolean detectAndRemove(Node head)
  {
    Node slow=head;
    Node fast=head.next;
    while(fast!=null && fast.next!=null)
    {
      if(slow==fast)
      {
        break;
      }
    slow=slow.next;
    fast=fast.next.next;
  }
    if(slow==fast)
    {  slow=head;
        while(fast.next!=slow)
        {
          slow=slow.next;
          fast=fast.next;
        }
        fast.next=null;
        System.out.println("Loop Removed");
        return true;
    }

    return false;
  }

  public static void printList(Node node) {
   Node currentNode = node;
   while (currentNode != null) {
    System.out.println(currentNode.data);
    currentNode = currentNode.next;
   }
}
}
