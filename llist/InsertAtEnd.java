class InsertAtEnd{
 static class Node {
  int data;
  Node next;
 }
 public static void main(String args[]) {
  Node node = insert(insert(insert(insert(null, 1), 2), 3),4);
  printList(node);

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


 public static void printList(Node node) {
  Node currentNode = node;
  while (currentNode != null) {
   System.out.println(currentNode.data);
   currentNode = currentNode.next;
  }


 }
}