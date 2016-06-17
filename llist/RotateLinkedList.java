class RotateLinkedList
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
     System.out.println("Rotating Right");
    head=rotateRight(head,2);
    printList(head);
     System.out.println("Rotating Left");
    printList(rotateLeft(head,4));

  }
public static Node rotateLeft(Node head,int i)
{
  Node currentNode=head;
  Node tail=getTail(head);
  while(currentNode!=null && i>0)
  {
    tail.next=currentNode;
    tail=currentNode;
    currentNode=currentNode.next;
    tail.next=null;
    i--;
  }
return currentNode;
}
public static Node rotateRight(Node head ,int i)
{
  Node currentNode=head;
  int l= getLength(head)-i-1;
  while(currentNode.next!=null && l>0)
  {
    currentNode=currentNode.next;
    l--;
  }
Node tail = getTail(head);
tail.next=head;
head=currentNode.next;
currentNode.next=null;
return head;
}

public static Node getTail(Node head)
{
  Node currentNode=head;
  while(currentNode.next!=null)
    currentNode=currentNode.next;
  return currentNode;
}

public static int getLength(Node head)
{
  Node currentNode=head;
  int len=0;
  while(currentNode!=null)
  {
    currentNode=currentNode.next;
    len++;
  }
return len;
}
  public static void printList(Node node) {
   Node currentNode = node;
   while (currentNode != null) {
    System.out.println(currentNode.data);
    currentNode = currentNode.next;
  }
  }

}
