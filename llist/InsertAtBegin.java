class InsertAtBegin {
 static class Node {
  int data;
  Node next;
 }
 public static void main(String args[]) {
  Node node = insert(insert(insert(null, 1), 2), 3);
  printList(node);

 }

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


 public static void printList(Node node) {
  Node currentNode = node;
  while (currentNode != null) {
   System.out.println(currentNode.data);
   currentNode = currentNode.next;
  }


 }
}