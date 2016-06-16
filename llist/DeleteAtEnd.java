/**
 * @author     Anurag Goel
 */
class DeleteAtEnd{
 static class Node {
  int data;
  Node next;
 }
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
  printList(delete(node1)); 
 }

 public static Node delete(Node head) {
  Node currentNode= head;
  while (currentNode.next.next != null) {
   currentNode = currentNode.next;
  }
 currentNode.next=null;
  return head;
 
 }


 public static void printList(Node node) {
  Node currentNode = node;
  while (currentNode != null) {
   System.out.println(currentNode.data);
   currentNode = currentNode.next;
  }


 }
}