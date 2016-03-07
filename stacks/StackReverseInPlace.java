package stacks;

import java.util.*;

/**
 * 
 * @author Anurag
 * 
 */
class StackReverseInPlace {

	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println("Original Stack : " + stack);
		reverse(stack);
		System.out.println("Revered Stack : " + stack);

	}

	public static void reverse(Stack<Integer> stack) {
		if (stack.size() <= 1)
			return;
		int e = stack.pop();
		reverse(stack);
		pushToBottom(e, stack);

	}

	public static void pushToBottom(int data, Stack<Integer> stack) {
		int element = stack.pop();
		if (stack.size() == 0) {
			stack.push(data);

		} else {
			pushToBottom(data, stack);
		}
		stack.push(element);
	}

}