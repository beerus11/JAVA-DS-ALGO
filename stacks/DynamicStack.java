import java.util.*;

public class DynamicStack {
 static class Node {
  int data;
  Node next;
  Node(int e) {
   this.data = e;
   this.next = null;
  }
 }
 LinkedList < Node > list;
 DynamicStack() {
  this.list = new LinkedList < Node > ();
 }
 public void push(int data) {
  list.add(new Node(data));
 }
 public int pop() {
  if (list.size() < 1)
   return -1;
  return list.remove().data;
 }
 public int Top() {
  return list.getLast().data;
 }
 public boolean isEmpty() {
  return list.size() < 1 ? true : false;
 }
 public static void main(String[] args) {
  DynamicStack stack = new DynamicStack();
  stack.push(1);
  stack.push(2);
  stack.push(3);
  stack.push(4);
  stack.push(5);
  while (!stack.isEmpty()) {
   System.out.println(stack.pop());
  }

 }
}
