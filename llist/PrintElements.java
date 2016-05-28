/**
 *@author     Anurag Goel
 * Print All Elements of Linked List
 */
class PrintElements {
 static class Node {
  int data;
  Node next;
 }
 /**
  * Main Method
  */
 public static void main(String args[]) {
  Node node1 = new Node();
  node1.data = 1;
  Node node2 = new Node();
  node2.data = 2;
  Node node3 = new Node();
  node3.data = 3;
  node1.next = node2;
  node2.next = node3;
  node3.next = null;
  printList(node1);

 }
/**
 * Print All Elements of Linked List
 *
 * @param      node  Head node
 */
 public static void printList(Node node) {
  Node currentNode = node;
  while (currentNode != null) {
   System.out.println(currentNode.data);
   currentNode = currentNode.next;
  }


 }
}