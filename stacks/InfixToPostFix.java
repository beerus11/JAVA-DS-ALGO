package stacks;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostFix {
	public static void main(String args[]) {
		Stack<Character> stack = new Stack<Character>();
		Scanner sc = new Scanner(System.in);
		// Read InFix String
		char inFixArray[] = sc.next().toCharArray();
		String postFixString = "";
		for (char e : inFixArray) {
			// check for operand
			if (e >= 'A' && e <= 'Z') {
				postFixString = postFixString + e;
			} else if (e >= 'a' && e <= 'z') {
				postFixString = postFixString + e;
			} else if (e == '(') {
				stack.push(e);
			} else if (e == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					postFixString = postFixString + stack.pop();
				}
				stack.pop();
			} else {
				// check for operator
				while (!stack.isEmpty() && Prec(stack.peek()) >= Prec(e)) {
					postFixString = postFixString + stack.pop();
				}
				stack.push(e);

			}
		}
		while (stack.isEmpty()) {
			postFixString = postFixString + stack.pop();
		}
		System.out.println(postFixString);

	}

	static int Prec(char e) {
		switch (e) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;

		case '^':
			return 3;

		}
		return -1;
	}
}
