class InsertAtNthPos
{
  static class Node {
   int data;
   Node next;
  }
  /**
  @main Method
  **/
  public static void main(String[] args) {
    Node head = insert(null,1,0);
    head=insert(head,2,0);
    head=insert(head,3,1);
    head=insert(head,4,2);
    head=insert(head,5,3);
    printList(head);

  }
  /**
   * Insert Node At Nth Position of Linked List
   *
   * @param      head  The head
   * @param      data  The data
   * @param      Nth Position
   * @return     return head of Linked List
   */
  public static Node insert(Node head, int data ,int pos) {
    Node node = new Node();
    node.data = data;
    node.next=null;
   if (head == null) {
    node.next = null;
    return node;
   }
   if(pos==0)
   {
     node.next=head;
     return node;
   }
   else{
     Node currentNode=head;
     while((pos-1)>0)
     {
       currentNode=currentNode.next;
       pos--;
     }
     if(currentNode.next==null)
     {
       currentNode.next=node;
       return head;
     }else{
     Node temp = currentNode.next;
     currentNode.next=node;
     node.next=temp;
     return head;
   }
   }
  }

 /**
  * Print All Elements of Linked List
  *
  * @param      Head of Linked List
  */
  public static void printList(Node node) {
   Node currentNode = node;
   while (currentNode != null) {
    System.out.println(currentNode.data);
    currentNode = currentNode.next;
   }


  }
}
