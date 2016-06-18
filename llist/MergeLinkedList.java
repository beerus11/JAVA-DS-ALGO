class MergeLinkedList
{
  static class Node
  {
    int data;
    Node next;
  }
  public static void main(String[] args) {
    Node head1 = new Node();
    Node head2=  new Node();
    Node head3=  new Node();
    head3=null;
    head1.data=0;
    head2.data=1;
    head1=insert(insert(insert(insert(insert(insert(head1,2),5),7),8),9),11);
    head2=insert(insert(insert(insert(insert(head2,2),6),8),11),13);
    while(true)
    {
      if(head1==null && head2==null)
      {
        break;
      }
      else if(head1==null)
      {
        head3=insert(head3,head2.data);
        head2=head2.next;
      }
      else if(head2==null)
      {
        head3=insert(head3,head1.data);
        head1=head1.next;
      }
      else if(head1.data<=head2.data)
      {
        head3=insert(head3,head1.data);
          head1=head1.next;
      }
      else{
        head3=insert(head3,head2.data);
          head2=head2.next;
      }
    }
    printList(head3);
  }

  public static Node insert(Node head, int data) {
   Node node = new Node();
   node.data = data;
   node.next = null;
      if(head==null)
      return node;
 Node currentNode= head;
 while(currentNode.next!=null)
 {
     currentNode=currentNode.next;
     }

   currentNode.next=node;
   return head;
  }

 /**
  * Print All Elements of Linked List
  *
  * @param      node  The node
  */
  public static void printList(Node node) {
   Node currentNode = node;
   while (currentNode != null) {
    System.out.println(currentNode.data);
    currentNode = currentNode.next;
   }

}
}
