class DeleteNthNode
{
  static class Node {
   int data;
   Node next;
  }
  /**
  @main Method
  **/
  public static void main(String[] args) {
  Node head = insert(insert(insert(insert(null, 1), 2), 3),4);
  head= delete(head,0);
  head= delete(head,2);
  printList(head);

  }
  /**
   * Delete Node At Nth Position of Linked List
   *
   * @param      head  The head
   *
   * @param      Nth Position
   * @return     return head of Linked List
   */
  public static Node delete(Node head,int pos) {
   if (head == null) {
    return head;
   }
   if(pos==0)
   {
     Node next = head.next;
     return next;
   }
   else{
     Node currentNode=head;
     while((pos-1)>0)
     {
       currentNode=currentNode.next;
       pos--;
     }
    Node next = currentNode.next.next;
    currentNode.next=next;
    return head;
   }

  }

  /**
   * Insert Node at End
   *
   * @param      head  The head node
   * @param      data  The data
   *
   * @return     { description_of_the_return_value }
   */
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
