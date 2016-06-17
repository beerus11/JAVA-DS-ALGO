class ReverseInpair
{
  static class Node
  {
    int data;
    Node next;
  }

  public static void main(String[] args) {
    Node head= new Node();
    head.data=0;
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
     head.next=node1;
     node1.next = node2;
     node2.next = node3;
     node3.next = node4;
     node4.next= node5;
     node5.next=node6;
     node6.next=null;
     printList(Reverse(head));
  }

  public static Node Reverse(Node head)
  {
    Node newHead=head.next;
    Node node0=head;
    Node currentNode= newHead.next;
    head.next=currentNode;
    newHead.next=head;
    while(currentNode.next !=null && currentNode.next.next!=null)
    {
  Node node1 = currentNode;
  Node node2= currentNode.next;
  Node node3 = currentNode.next.next;
  node1.next=node3;
  node2.next=node1;
  node0.next=node2;

  node0=currentNode;
  currentNode=currentNode.next;
   }
return newHead;
  }

  public static void printList(Node node) {
   Node currentNode = node;
   while (currentNode != null) {
    System.out.println(currentNode.data);
    currentNode = currentNode.next;
   }

}
}
