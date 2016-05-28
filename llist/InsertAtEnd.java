/**
 * @author     Anurag Goel
 * Example : Insert At End of Linked List
 */
class InsertAtEnd{
 static class Node {
  int data;
  Node next;
 }
 /**
  * Main Method
  */
 public static void main(String args[]) {
  Node node = insert(insert(insert(insert(null, 1), 2), 3),4);
  printList(node);

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