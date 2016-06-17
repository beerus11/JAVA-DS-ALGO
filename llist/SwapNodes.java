class SwapNodes
{
  static class Node{
    int data;
    Node next;
  }
  public static void main(String[] args) {
    Node head = new Node();
     head.data = 1;
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
     head.next = node2;
     node2.next = node3;
     node3.next = node4;
     node4.next=node5;
     node5.next=node6;
     node6.next=node7;
     node7.next=null;
     head=swap(head,2,6);
     //head=swap(head,2,3);
     printList(head);
  }
public static Node  swap(Node head , int x , int y)
{
        if(x==y)
          return head;

        // Search for x (keep track of prevX and CurrX)
        Node prevX = null, currX = head;
        while (currX != null && currX.data != x)
        {
            prevX = currX;
            currX = currX.next;
        }

        // Search for y (keep track of prevY and currY)
       Node prevY = null, currY = head;
       while (currY != null && currY.data != y)
       {
           prevY = currY;
           currY = currY.next;
       }

       // If either x or y is not present, nothing to do
        if (currX == null || currY == null)
            return head;

            // If x is not head of linked list
            if (prevX != null)
                prevX.next = currY;
            else //make y the new head
                head = currY;

            // If y is not head of linked list
            if (prevY != null)
                prevY.next = currX;
            else // make x the new head
                head = currX;

            // Swap next pointers
            Node temp = currX.next;
            currX.next = currY.next;
            currY.next = temp;
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
