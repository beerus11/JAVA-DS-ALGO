 class SumOfNodes
{
  static class Node {
   int data;
   Node next;
  }
  public static void main(String[] args) {
    Node node1 = new Node();
     node1.data = 1;
     Node node2 = new Node();
     node2.data = 2;
     Node node3 = new Node();
     node3.data = 3;
     node1.next = node2;
     node2.next = node3;
     node3.next = null;
     printSum(node1);
  }

  public static void printSum(Node head) {
    int sum=0;
   Node currentNode = head;
   while (currentNode != null) {
     sum+=currentNode.data;
    currentNode = currentNode.next;
   }
   System.out.println("Sum is : "+sum);
 }
}
