/**
 *@author     Anurag Goel
 * Example : Insert At Beginning of Linked List
 */
class InsertAtBegin {
 static class Node {
  int data;
  Node next;
 }
 /**
  * Main Method
  */
 public static void main(String args[]) {
  Node node = insert(insert(insert(null, 1), 2), 3);
  printList(node);

 }
 /**
  * Insert Node At Beginning of Linked List
  *
  * @param      head  The head
  * @param      data  The data
  *
  * @return     return head of Linked List
  */
 public static Node insert(Node head, int data) {
  if (head == null) {
   Node node = new Node();
   node.data = data;
   node.next = null;
   return node;
  }
  Node node = new Node();
  node.data = data;
  node.next = head;
  return node;
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